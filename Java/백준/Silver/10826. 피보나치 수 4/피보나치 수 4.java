import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        BigInteger[] fibo = new BigInteger[num + 2];

        fibo[0] = new BigInteger("0");
        fibo[1] = new BigInteger("1");
        
        
        for (int i = 2; i <= num; i++) {
            fibo[i] = fibo[i - 1].add(fibo[i - 2]);
        }

        bw.write(fibo[num] + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
