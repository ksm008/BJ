import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    static StringTokenizer st;  
  
    public static void main(String[] args) throws IOException {  
        st = new StringTokenizer(br.readLine());  
  
        int N = Integer.parseInt(st.nextToken());  
        int A = Integer.parseInt(st.nextToken());  
        int B = Integer.parseInt(st.nextToken());  
  
        int[][] classroom = new int[N + 1][N + 1];  
  
        for (int i = 1; i <= N; i++) {  
            st = new StringTokenizer(br.readLine());  
            for (int j = 1; j <= N; j++) {  
                classroom[i][j] = Integer.parseInt(st.nextToken());  
            }  
        }  
  
        int jinseo = classroom[A][B];  
        String result = "HAPPY";  
  
        for (int i = 1; i <= N; i++) {  
            if (classroom[A][i] > jinseo || classroom[i][B] > jinseo) {  
                result = "ANGRY";  
                break;  
            }  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}