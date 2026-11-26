import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        long W = Long.parseLong(st.nextToken());  
        long H = Long.parseLong(st.nextToken());  
        long f = Long.parseLong(st.nextToken());  
        long c = Long.parseLong(st.nextToken());  
        long x1 = Long.parseLong(st.nextToken());  
        long y1 = Long.parseLong(st.nextToken());  
        long x2 = Long.parseLong(st.nextToken());  
        long y2 = Long.parseLong(st.nextToken());  
  
        long layered = Math.min(f, W - f);  
  
        long verticalSpace;  
        if (x2 <= layered) {  
            verticalSpace = (x2 - x1) * (y2 - y1) * 2;  
        } else if (x1 >= layered) {  
            verticalSpace = (x2 - x1) * (y2 - y1);  
        } else {  
            verticalSpace = (layered - x1) * (y2 - y1) * 2 + (x2 - layered) * (y2 - y1);  
        }  
  
        long totalSpace = (c + 1) * verticalSpace;  
        long result = (W * H) - totalSpace;  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}