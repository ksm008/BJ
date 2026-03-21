import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int T = Integer.parseInt(br.readLine());  
  
        for (int i = 1; i <= T; i++) {  
            sb.append("Case #").append(i).append(": ");  
            int N = Integer.parseInt(br.readLine());  
  
            if (N <= 25) sb.append("World Finals\n");  
            else if (N <= 1000) sb.append("Round 3\n");  
            else if (N <= 4500) sb.append("Round 2\n");  
            else {  
                sb.append("Round 1\n");  
            }  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}