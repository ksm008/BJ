import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int[] fruitTanghuru = new int[N];  
        int[] cnt = new int[10];  
        int L = 0;  
        int fruitType = 0;  
        int result = 0;  
  
        for (int i = 0; i < N; i++) {  
            int cur = Integer.parseInt(st.nextToken());  
            fruitTanghuru[i] = cur;  
            cnt[fruitTanghuru[i]]++;  
            if (cnt[fruitTanghuru[i]] == 1) {  
                fruitType++;  
            }  
  
            while (fruitType > 2) {  
                cnt[fruitTanghuru[L]]--;  
                if (cnt[fruitTanghuru[L]] == 0) {  
                    fruitType--;  
                }  
                L++;  
            }  
  
            result = Math.max(i - L + 1, result);  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}