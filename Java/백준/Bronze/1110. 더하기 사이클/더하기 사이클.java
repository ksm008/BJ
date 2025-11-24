import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        int result = N;  
        int cnt = 0;  
  
        while (true) {  
            cnt++;  
            int temp; int ten; int one;  
  
            if (result < 10) {  
                ten = 0;  
                one = result;  
            } else {  
                ten = result / 10;  
                one = result % 10;  
            }  
  
            temp = ten + one;  
            result = one * 10 + temp % 10;  
  
            if (result == N) {  
                break;  
            }  
        }  
  
        sb.append(cnt);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}