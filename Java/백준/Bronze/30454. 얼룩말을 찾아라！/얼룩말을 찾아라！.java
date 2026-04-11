import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    static StringTokenizer st;  
  
    public static void main(String[] args) throws IOException {  
        st = new StringTokenizer(br.readLine());  
  
        int N = Integer.parseInt(st.nextToken());  
        int L = Integer.parseInt(st.nextToken());  
  
        int maxLen = 0;  
        int maxCnt = 0;  
  
        for (int i = 0; i < N; i++) {  
            String str = br.readLine();  
  
            boolean isOne = false;  
            int cnt = 0;  
  
            for (int j = 0; j < L; j++) {  
                char ch = str.charAt(j);  
                if (ch == '1') {  
                    if (!isOne) {  
                        cnt++;  
                        isOne = true;  
                    }  
                } else {  
                    isOne = false;  
                }  
            }  
  
            if (cnt > maxLen) {  
                maxLen = cnt;  
                maxCnt = 1;  
            } else if (cnt == maxLen) {  
                maxCnt++;  
            }  
        }  
  
        sb.append(maxLen).append(" ").append(maxCnt);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}