import java.io.*;  
import java.math.BigInteger;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        BigInteger[] numbers = new BigInteger[N + 1];  
  
        if (N == 0) {  
            sb.append(0);  
        } else if (N == 1) {  
            sb.append(1);  
        } else if (N == 2) {  
            sb.append(1);  
        } else {  
            numbers[0] = new BigInteger("0");  
            numbers[1] = new BigInteger("1");  
            numbers[2] = new BigInteger("1");  
            for (int i = 3; i <= N; i++) {  
                numbers[i] = numbers[i - 1].add(numbers[i - 2]);  
            }  
            sb.append(numbers[N]);  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}