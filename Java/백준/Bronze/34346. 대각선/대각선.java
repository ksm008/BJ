import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        if (N % 2 == 0) sb.append(2);  
        else sb.append(1);  
          
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}