import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int[] result;  
    static int cnt;  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  
        int R = Integer.parseInt(st.nextToken());  
  
        ArrayList<Integer> graph[] = new ArrayList[N + 1];  
        boolean[] visited = new boolean[N + 1];  
  
        for (int i = 1; i <= N; i++) {  
            graph[i] = new ArrayList<>();  
        }  
  
        result = new int[N + 1];  
        cnt = 0;  
  
        for (int i = 1; i <= M; i++) {  
            st = new StringTokenizer(br.readLine());  
  
            int U = Integer.parseInt(st.nextToken());  
            int V = Integer.parseInt(st.nextToken());  
  
            graph[U].add(V);  
            graph[V].add(U);  
        }  
  
        for (int i = 1; i <= N; i++) {  
            if (graph[i].size() != 0) {  
                Collections.sort(graph[i]);  
            }  
        }  
  
        dfs(graph, visited, R);  
  
        for (int i = 1; i <= N; i++) {  
            sb.append(result[i]).append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static void dfs(ArrayList<Integer> graph[], boolean[] visited, int start) {  
        visited[start] = true;  
        cnt++;  
        result[start] = cnt;  
        for (int num : graph[start]) {  
            if (!visited[num]) {  
                dfs(graph, visited, num);  
            }  
        }  
    }  
}