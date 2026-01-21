import java.io.*;  
import java.util.ArrayList;  
import java.util.Arrays;  
import java.util.PriorityQueue;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static class Node implements Comparable<Node> {  
        int idx;  
        int cost;  
  
        public Node(int idx, int cost) {  
            this.idx = idx;  
            this.cost = cost;  
        }  
  
        @Override  
        public int compareTo(Node o) {  
            return this.cost - o.cost;  
        }  
    }  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int vCount = Integer.parseInt(st.nextToken());  
        int E = Integer.parseInt(st.nextToken());  
        int K = Integer.parseInt(br.readLine());  
        int[] dist = new int[vCount + 1];  
        Arrays.fill(dist, Integer.MAX_VALUE);  
        dist[K] = 0;  
  
        ArrayList<ArrayList<Node>> graph = new ArrayList<>();  
        PriorityQueue<Node> pq = new PriorityQueue<>();  
        pq.offer(new Node(K, 0));  
  
        for (int i = 0; i <= vCount; i++) {  
            graph.add(new ArrayList<>());  
        }  
  
        for (int i = 0; i < E; i++) {  
            st = new StringTokenizer(br.readLine());  
            int U = Integer.parseInt(st.nextToken());  
            int V = Integer.parseInt(st.nextToken());  
            int W = Integer.parseInt(st.nextToken());  
  
            ArrayList<Node> temp = graph.get(U);  
            temp.add(new Node(V, W));  
        }  
  
        while (!pq.isEmpty()) {  
            Node u = pq.poll();  
            ArrayList<Node> temp = graph.get(u.idx);  
  
            if (u.cost > dist[u.idx]) continue;  
            else {  
                for (Node v : temp) {  
                    if (dist[v.idx] > dist[u.idx] + v.cost) {  
                        dist[v.idx] = dist[u.idx] + v.cost;  
                        pq.offer(new Node(v.idx, dist[v.idx]));  
                    }  
                }  
            }  
        }  
  
        for (int i = 1; i <= vCount; i++) {  
            if (dist[i] == Integer.MAX_VALUE) sb.append("INF").append('\n');  
            else sb.append(dist[i]).append('\n');  
        }  
  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}