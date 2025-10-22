import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        long N = Long.parseLong(br.readLine());  
        long result = 0;  
        long incrementNum = 1;  
        int cnt = 0;  
  
        while (true) {  
            if (result == N) break;  
            else if (result > N) {  
                cnt--;  
                break;  
            }  
            result += incrementNum;  
            incrementNum++;  
            cnt++;  
        }  
  
        sb.append(cnt);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}