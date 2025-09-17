import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 1; i <= N; i++) Collections.sort(graph.get(i));

        boolean[] visited = new boolean[N + 1];

        dfs(graph, V, visited);
        sb.append("\n");

        Arrays.fill(visited, false);
        bfs(graph, V, visited);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(List<List<Integer>> g, int v, boolean[] visited) {
        visited[v] = true;
        sb.append(v).append(" ");
        for (int next : g.get(v)) {
            if (!visited[next]) dfs(g, next, visited);
        }
    }

    static void bfs(List<List<Integer>> g, int start, boolean[] visited) {
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(start);
        visited[start] = true;

        while (!q.isEmpty()) {
            int v = q.poll();
            sb.append(v).append(" ");
            for (int next : g.get(v)) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(next);
                }
            }
        }
    }
}
