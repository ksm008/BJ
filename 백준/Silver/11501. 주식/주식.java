import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int T = Integer.parseInt(br.readLine());  
  
        for (int i = 0; i < T; i++) {  
            int N = Integer.parseInt(br.readLine());  
            int[] stockByDays = new int[N];  
            StringTokenizer st = new StringTokenizer(br.readLine());  
  
  
            for (int j = 0; j < N; j++) {  
                stockByDays[j] = Integer.parseInt(st.nextToken());  
            }  
  
            long result = 0;  
            int max = stockByDays[N - 1];  
  
            for (int j = N - 1; j >= 0; j--) {  
                if (stockByDays[j] < max) result += max - stockByDays[j];  
                else max = stockByDays[j];  
            }  
  
            sb.append(result).append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}