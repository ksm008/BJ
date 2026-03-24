import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    static ArrayList<Integer>[] list;
    static int N;
    static int M;
    static Deque<Integer> queue = new ArrayDeque<>();
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        list = new ArrayList[N + 1];
        visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            list[B].add(A);
        }

        ArrayList<Integer> result = new ArrayList<>();
        int currMax = Integer.MIN_VALUE;

        for (int i = 1; i <= N; i++) {

            int bfsValue = bfs(i);
            if (bfsValue > currMax) {
                if (result.size() > 0) result.clear();
                currMax = bfsValue;
                result.add(i);
            } else if (bfsValue == currMax) {
                result.add(i);
            }

        }

        for (int i = 0; i < result.size(); i++) {
            if (i != result.size() - 1) {
                sb.append(result.get(i)).append(" ");
            } else {
                sb.append(result.get(i));
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static int bfs(int idx) {
        queue.clear();
        Arrays.fill(visited, false);
        int max = 0;

        queue.offer(idx);
        visited[idx] = true;

        while (!queue.isEmpty()) {
            int nextIdx = queue.poll();

            for (int i : list[nextIdx]) {
                if (!visited[i]) {
                    queue.offer(i);
                    visited[i] = true;
                }
            }
            max++;
        }

        return max;
    }
}