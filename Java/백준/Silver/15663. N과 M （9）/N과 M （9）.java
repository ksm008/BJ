import java.io.*;  
import java.util.Arrays;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int[] temp;  
    static boolean[] visited;  
    static int[] numberArray;  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  
  
        temp = new int[M];  
        visited = new boolean[N + 1];  
  
        st = new StringTokenizer(br.readLine());  
        numberArray = new int[N + 1];  
  
        for (int i = 1; i <= N; i++) {  
            numberArray[i] = Integer.parseInt(st.nextToken());  
        }  
  
        Arrays.sort(numberArray);  
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
  
        int before = 0;  
  
        for (int i = 1; i <= N; i++) {  
            if (!visited[i] && before != numberArray[i]) {  
                visited[i] = true;  
                temp[depth] = numberArray[i];  
                before = numberArray[i];  
                recursive(depth + 1, N, M);  
                visited[i] = false;  
            }  
        }  
    }  
}