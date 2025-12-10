import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int[] dist;  
    static int[] parent;  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        dist = new int[1000001];  
        parent = new int[1000001];  
  
        dist[1] = 0;  
        parent[1] = 0;  
  
        for (int i = 2; i <= N; i++) {  
            dist[i] = dist[i - 1] + 1;  
            parent[i] = i - 1;  
            if (i % 2 == 0 && dist[i] > dist[i / 2] + 1) {  
                dist[i] = dist[i / 2] + 1;  
                parent[i] = i / 2;  
            }  
            if (i % 3 == 0 && dist[i] > dist[i / 3] + 1) {  
                dist[i] = dist[i / 3] + 1;  
                parent[i] = i / 3;  
            }  
        }  
  
       sb.append(dist[N]).append("\n");  
        for (int i = N; i >= 1; i = parent[i]) {  
            if (i == 1) {  
                sb.append(i);  
            } else {  
                sb.append(i).append(" ");  
            }  
        }  
  
       bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}