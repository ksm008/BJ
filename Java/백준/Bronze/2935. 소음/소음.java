import java.io.*;  
import java.math.BigInteger;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        BigInteger A = new BigInteger(br.readLine());  
        char ch = br.readLine().charAt(0);  
        BigInteger B = new BigInteger(br.readLine());  
  
        if (ch == '+') sb.append(A.add(B));  
        else sb.append(A.multiply(B));  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}