import java.io.*;  
import java.util.ArrayDeque;  
import java.util.ArrayList;  
import java.util.Deque;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    static StringTokenizer st;  
  
    static int N;  
    static ArrayList<Integer>[] graph;  
    static int[] nodeParents;  
  
    public static void main(String[] args) throws IOException {  
        N = Integer.parseInt(br.readLine());  
  
        graph = new ArrayList[N + 1];  
        nodeParents = new int[N + 1];  
  
        for (int i = 1; i < N + 1; i++) {  
            graph[i] = new ArrayList<>();  
        }  
  
        for (int i = 0; i < N - 1; i++) {  
            st = new StringTokenizer(br.readLine());  
  
            int start = Integer.parseInt(st.nextToken());  
            int end = Integer.parseInt(st.nextToken());  
  
            graph[start].add(end);  
            graph[end].add(start);  
        }  
  
        bfs();  
  
        for (int i = 2; i <= N; i++) {  
            sb.append(nodeParents[i]).append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static void bfs() {  
        ArrayList<Integer> temp;  
        Deque<Integer> queue = new ArrayDeque<>();  
        boolean[] visited = new boolean[N + 1];  
        queue.add(1);  
        visited[1] = true;  
  
        while (!queue.isEmpty()) {  
            int curr = queue.poll();  
            temp =  graph[curr];  
  
            for (int i : temp) {  
                if (!visited[i]) {  
                    queue.add(i);  
                    visited[i] = true;  
                    nodeParents[i] = curr;  
                }  
            }  
        }  
    }  
}