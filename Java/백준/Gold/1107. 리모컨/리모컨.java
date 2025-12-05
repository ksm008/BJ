import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int M;  
    static boolean[] brokenRemotebtn = new boolean[10];  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        M = Integer.parseInt(br.readLine());  
  
        if (M != 0) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
            for (int i = 0; i < M; i++) {  
                brokenRemotebtn[Integer.parseInt(st.nextToken())] = true;  
            }  
        }  
  
        int result = searchChannel(N);  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static int searchChannel(int N) {  
        int min = Math.abs(N - 100);  
  
        for (int i = 0; i < 1000000; i++) {  
            int length = Integer.toString(i).length();  
            boolean isBroken = false;  
            int temp = i;  
            for (int j = 0; j < length; j++) {  
                int digit = temp % 10;  
                if (M > 0 && brokenRemotebtn[digit]) {  
                    isBroken = true;  
                    break;  
                }  
                temp /= 10;  
            }  
            if (!isBroken) {  
                int totalPressed = length + Math.abs(N - i);  
                min = Math.min(min, totalPressed);  
            }  
        }  
  
        return min;  
    }  
}