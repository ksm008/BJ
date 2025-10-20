import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int H = Integer.parseInt(st.nextToken());  
        int W = Integer.parseInt(st.nextToken());  
  
        for (int i = 0; i < H; i++) {  
            String str = br.readLine();  
            int cloud = -1;  
            for (int j = 0; j < W; j++) {  
                char ch = str.charAt(j);  
                if (ch == 'c') {  
                    cloud = 0;  
                    sb.append(cloud);  
                } else if (ch == '.' && cloud != -1) {  
                    cloud++;  
                    sb.append(cloud);  
                } else {  
                    sb.append(cloud);  
                }  
                sb.append(" ");  
            }  
            sb.append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}