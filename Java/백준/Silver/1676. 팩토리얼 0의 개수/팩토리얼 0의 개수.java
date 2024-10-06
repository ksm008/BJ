import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        BigInteger fact = BigInteger.ONE;

        for (int i = 1; i <= num; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }

        String factStr = fact.toString();
        int zeroCnt = 0;

        for (int i = factStr.length() - 1; i >= 0; i--) {
            if (factStr.charAt(i) == '0') {
                zeroCnt++;
            } else {
                break;
            }
        }
        bw.write(Integer.toString(zeroCnt));

        bw.flush();
        bw.close();
        br.close();
    }
}