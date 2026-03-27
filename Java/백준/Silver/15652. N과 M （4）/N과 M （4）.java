import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int[] arr;  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  
  
        arr = new int[N];  
        backtrack(0, 1, N, M);  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static void backtrack(int depth, int start, int N, int M) {  
        if (depth == M) {  
            for (int i = 0; i < M; i++) {  
                if (i != M - 1) {  
                    sb.append(arr[i]).append(" ");  
                } else {  
                    sb.append(arr[i]).append('\n');  
                }  
            }  
            return;  
        }  
  
        for (int i = start; i <= N; i++) {  
            arr[depth] = i;  
            backtrack(depth + 1, i, N, M);  
        }  
    }  
}