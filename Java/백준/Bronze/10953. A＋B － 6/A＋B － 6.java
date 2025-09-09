import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int num = Integer.parseInt(br.readLine());  
  
        for (int i = 0; i < num; i++) {  
            String[] str = br.readLine().split(",");  
            int A = Integer.parseInt(str[0]);  
            int B = Integer.parseInt(str[1]);  
            sb.append(A + B + "\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}