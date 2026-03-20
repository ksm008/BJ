import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int[] temp;  
    static boolean[] visited;  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  
  
        temp = new int[M];  
        visited = new boolean[N + 1];  
  
        recursive(0, N, M);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static void recursive(int depth, int N, int M) {  
        if (depth == M) {  
            for (int i = 0; i < M; i++) {  
                if (i != M - 1) {  
                    sb.append(temp[i] + " ");  
                } else {  
                    sb.append(temp[i] + "\n");  
                }  
            }  
            return;  
        }  
  
        for (int i = 1; i <= N; i++) {  
            if (!visited[i]) {  
                visited[i] = true;  
                temp[depth] = i;  
                recursive(depth + 1, N, M);  
                visited[i] = false;  
            }  
        }  
    }  
}