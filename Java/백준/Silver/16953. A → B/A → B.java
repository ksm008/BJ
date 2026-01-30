import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        int A = Integer.parseInt(st.nextToken());  
        int B = Integer.parseInt(st.nextToken());  
  
        int result = greedy(A, B);  
        sb.append(result);  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static int greedy(int A, int B) {  
        int repeat = 1;  
  
        while (B != A) {  
            if (B < A) {  
                return -1;  
            }  
  
            if (B % 2 == 0 && B / 2 > 0) {  
                B /= 2;  
            } else if (B % 10 == 1) {  
                B /= 10;  
            } else {  
                return -1;  
            }  
            repeat++;  
        }  
  
        return repeat;  
    }  
}