import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int T = Integer.parseInt(br.readLine());  
  
        for (int i = 0; i < T; i++) {  
            int N = Integer.parseInt(br.readLine());  
            int end = N % 100;  
            if ((N + 1) % end == 0) {  
                sb.append("Good").append("\n");  
            } else {  
                sb.append("Bye").append("\n");  
            }  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}