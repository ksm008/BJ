import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 전체 피씨 입력 받고
        int totalPC = Integer.parseInt(br.readLine());

        // 몇개가 서로 이어져있는지 입력 받고
        int num = Integer.parseInt(br.readLine());

        List<Integer>[] graph = new List[totalPC + 1];

        for (int i = 1; i <= totalPC; i++) {
            graph[i] = new ArrayList<>();
        }

        // 반복문으로 링크시키기
        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");

            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);

            graph[a].add(b);
            graph[b].add(a);
        }

        visited = new boolean[totalPC + 1];

        int infected = countInfected(1, graph);

        bw.write(infected + "");

        bw.flush();
        bw.close();
        br.close();
    }


    static boolean[] visited;

    // 1번을 통해 감염되는 컴퓨터 수를 리턴 (1번 자신은 제외)
    static int countInfected(int start, List<Integer>[] graph) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        visited[start] = true;
        q.offer(start);

        // 새로 방문한 이웃만 셈, 1번은 자동 제외
        int infected = 0;

        while (!q.isEmpty()) {
            int cur = q.poll();

            for (int nxt : graph[cur]) {
                if (!visited[nxt]) {
                    visited[nxt] = true;
                    q.offer(nxt);
                    infected++;
                }
            }
        }
        return infected;
    }
}
