import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int A = Integer.parseInt(br.readLine());  
        int B = Integer.parseInt(br.readLine());  
        int C = Integer.parseInt(br.readLine());  
        int D = Integer.parseInt(br.readLine());  
        int E = Integer.parseInt(br.readLine());  
  
        int result = 0;  
  
        if (A < 0) {  
            result += (-A) * C;  
            result += D;  
            result += B * E;  
        } else {  
            result += (B - A) * E;  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}