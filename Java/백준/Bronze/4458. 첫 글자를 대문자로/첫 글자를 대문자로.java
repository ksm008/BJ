import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        int cnt = 0;  
  
        for (int i = 0; i < N; i++) {  
            String str = br.readLine();  
            char ch = str.charAt(0);  
  
            if (ch > 96) {  
                ch -= 32;  
            }  
            sb.append(ch).append(str.substring(1)).append('\n');  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}