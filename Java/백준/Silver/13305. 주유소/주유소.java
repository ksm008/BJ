import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        long[] streetLen = new long[N - 1];  
        long[] gasPrice = new long[N - 1];  
  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        for (int i = 0; i < N - 1; i++) {  
            streetLen[i] = Long.parseLong(st.nextToken());  
        }  
  
        st = new StringTokenizer(br.readLine());  
        for (int i = 0; i < N - 1; i++) {  
            gasPrice[i] = Long.parseLong(st.nextToken());  
        }  
  
        long result = 0;  
        long lowestPrice = gasPrice[0];  
  
        for (int i = 0; i < N - 1; i++) {  
            long currentPrice = gasPrice[i];  
  
            if (currentPrice < lowestPrice) {  
                lowestPrice = currentPrice;  
            }  
  
            result += lowestPrice * streetLen[i];  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}