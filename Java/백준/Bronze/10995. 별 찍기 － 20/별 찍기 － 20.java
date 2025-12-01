import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        for (int i = 0; i < N; i++) {  
            for (int j = 0; j < 2 * N; j++) {  
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1)) {  
                    sb.append("*");  
                } else if (i % 2 == 0) {  
                    if (j != 2 * N - 1) {  
                        sb.append(" ");  
                    }  
                } else {  
                    sb.append(" ");  
                }  
            }  
            sb.append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}