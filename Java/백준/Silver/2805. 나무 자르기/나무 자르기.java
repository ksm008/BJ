import java.io.*;  
import java.util.Arrays;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  
  
        st = new StringTokenizer(br.readLine());  
        int[] trees = new int[N];  
        for (int i = 0; i < N; i++) {  
            trees[i] = Integer.parseInt(st.nextToken());  
        }  
        Arrays.sort(trees);  
  
        long min = 1;  
        long max = trees[N - 1];  
        long result = 0;  
  
        while (min <= max) {  
            long mid = (min + max) / 2;  
            long totalLen = 0;  
  
            for (int treeLen : trees) {  
                long temp = treeLen - mid;  
                if (temp > 0) {  
                    totalLen += treeLen - mid;  
                }  
            }  
  
            if (totalLen < M) {  
                max = mid - 1;  
            } else {  
                result = mid;  
                min = mid + 1;  
            }  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}