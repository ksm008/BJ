import java.io.*;  
import java.util.HashSet;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int N = Integer.parseInt(st.nextToken());  
        int M = Integer.parseInt(st.nextToken());  
  
        HashSet<String> set = new HashSet<>();  
  
        for (int i = 0; i < N; i++) {  
            String str = br.readLine();  
            set.add(str);  
        }  
  
        int result = 0;  
  
        for (int i = 0; i < M; i++) {  
            String str = br.readLine();  
            if (set.contains(str)) result++;  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}