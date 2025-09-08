import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        while (true) {
            BigInteger num = new BigInteger(br.readLine());
            if (num.equals(BigInteger.ZERO)) {
                break;
            }
            BigInteger result = num.mod(BigInteger.valueOf(42));
            if (result.equals(BigInteger.ZERO)) {
                sb.append("PREMIADO").append("\n");
            } else {
                sb.append("TENTE NOVAMENTE").append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
