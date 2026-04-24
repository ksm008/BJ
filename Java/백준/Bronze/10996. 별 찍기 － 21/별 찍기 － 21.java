import java.io.*;  
import java.util.StringTokenizer;  
  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        for (int i = 0; i < N; i++) {  
            if (N % 2 == 0) {  
                for (int j = 0; j < N - 1; j++) {  
                    sb.append(j % 2 == 0 ? "*" : " ");  
                }  
            } else {  
                for (int j = 0; j < N; j++) {  
                    sb.append(j % 2 == 0 ? "*" : " ");  
                }  
            }  
            sb.append('\n');  
            if (N % 2 != 0) {  
                for (int j = 0; j < N - 1; j++) {  
                    sb.append(j % 2 == 0 ? " " : "*");  
                }  
            } else {  
                for (int j = 0; j < N; j++) {  
                    sb.append(j % 2 == 0 ? " " : "*");  
                }  
            }  
            if (i != N - 1) {  
                sb.append('\n');  
            }  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}