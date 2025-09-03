import java.io.*;  
import java.math.BigInteger;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 큰 정수 처리를 위해 BigInteger 쓰기  
  
        String[] str = br.readLine().split(" ");  
        BigInteger num1 = new BigInteger(br.readLine());  
        BigInteger num2 = new BigInteger(br.readLine());  
  
        bw.write(num1.multiply(num2) + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}