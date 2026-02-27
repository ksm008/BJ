import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  
  
        int setMin = Integer.MAX_VALUE;  
        int indivMin = Integer.MAX_VALUE;  
  
        for (int i = 0; i < M; i++) {  
            st = new StringTokenizer(br.readLine());  
  
            setMin = Math.min(setMin, Integer.parseInt(st.nextToken()));  
            indivMin = Math.min(indivMin, Integer.parseInt(st.nextToken()));  
        }  
  
        int indivToSet = indivMin * 6;  
        int result = Math.min(setMin, indivToSet) * (N / 6) + (Math.min(setMin, indivMin * (N % 6)));  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}