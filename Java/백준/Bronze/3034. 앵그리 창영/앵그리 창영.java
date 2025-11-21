import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int N = Integer.parseInt(st.nextToken());  
        int W = Integer.parseInt(st.nextToken());  
        int H = Integer.parseInt(st.nextToken());  
  
        for (int i = 0; i < N; i++) {  
            double matchLen = Integer.parseInt(br.readLine());  
            // 상자의 밑바닥 대각선 길이 (피타고라스의 정리)보다 짧거나 같으면 넣을 수 있음  
            double result = Math.sqrt(W * W + H * H);  
  
            if (result >= matchLen) {  
                sb.append("DA\n");  
            } else {  
                sb.append("NE\n");  
            }  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}