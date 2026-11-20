import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int T = Integer.parseInt(br.readLine());  
  
        for (int i = 0;  i < T; i++) {  
            int quo = Integer.parseInt(br.readLine());  
            int curr = 0;  
  
            while (quo > 0) {  
                if ((quo & 1) == 1) {  
                    sb.append(curr).append(" ");  
                }  
                quo >>= 1;  
                curr++;  
            }  
            sb.append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}