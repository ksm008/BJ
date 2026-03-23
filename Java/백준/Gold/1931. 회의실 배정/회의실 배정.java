import java.io.*;  
import java.util.ArrayList;  
import java.util.Comparator;  
import java.util.List;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        List<int[]> list = new ArrayList<>();  
        for (int i = 0; i < N; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
            int start = Integer.parseInt(st.nextToken());  
            int end = Integer.parseInt(st.nextToken());  
  
            list.add(new int[]{start, end});  
        }  
  
        list.sort(Comparator.comparingInt((int[] arr) -> arr[1]).thenComparingInt((int[] arr) -> arr[0]));  
  
        int[] start = list.get(0);  
        int cnt = 1;  
        int endTime = start[1];  
  
        for (int i = 1; i < N; i++) {  
            int[] cur = list.get(i);  
            if (cur[0] >= endTime) {  
                cnt++;  
                endTime = cur[1];  
            }  
        }  
  
        sb.append(cnt);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}