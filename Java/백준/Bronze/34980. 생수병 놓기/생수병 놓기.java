import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    static StringTokenizer st;  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        boolean[] beforeW = new boolean[N];  
        boolean[] afterW = new boolean[N];  
        boolean isChanged = false;  
  
        int beforeWcnt = 0;  
        int afterWcnt = 0;  
  
        String beforeStr = br.readLine();  
  
        for (int i = 0; i < N; i++) {  
            char ch = beforeStr.charAt(i);  
            if (ch == 'w') {  
                beforeWcnt++;  
                beforeW[i] = true;  
            }  
        }  
  
        String after = br.readLine();  
  
        for (int i = 0; i < N; i++) {  
            char ch = after.charAt(i);  
            if (ch == 'w') {  
                afterWcnt++;  
                afterW[i] = true;  
            }  
        }  
  
        if (beforeWcnt > afterWcnt) {  
            sb.append("Oryang");  
        } else if (beforeWcnt < afterWcnt) {  
            sb.append("Manners maketh man");  
        } else {  
            for (int i = 0; i < N; i++) {  
                if (beforeW[i] != afterW[i]) {  
                    isChanged = true;  
                    break;  
                }  
            }  
  
            if (isChanged) {  
                sb.append("Its fine");  
            } else {  
                sb.append("Good");  
            }  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}