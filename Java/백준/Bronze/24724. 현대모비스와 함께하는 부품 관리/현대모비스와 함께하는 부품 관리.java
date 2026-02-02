import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int T = Integer.parseInt(br.readLine());  
  
        for (int i = 0; i < T; i++) {  
            int N = Integer.parseInt(br.readLine());  
  
            for (int j = 0; j < N + 1; j++) {  
                String str = br.readLine();  
            }  
  
            sb.append("Material Management ").append(i + 1).append('\n');  
            sb.append("Classification ---- End!").append('\n');  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}