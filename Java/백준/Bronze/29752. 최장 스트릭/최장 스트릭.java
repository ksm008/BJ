import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int currStreak = 0;  
        int maxStreak = 0;  
  
        for (int i = 0; i < N; i++) {  
            if (st.nextToken().equals("0")) {  
                currStreak = 0;  
            } else {  
                currStreak++;  
                maxStreak = Math.max(currStreak, maxStreak);  
            }  
        }  
  
        sb.append(maxStreak);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}