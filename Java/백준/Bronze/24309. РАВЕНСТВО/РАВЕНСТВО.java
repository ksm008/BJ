import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());
        BigInteger C = new BigInteger(br.readLine());

        BigInteger D = B.subtract(C);
        BigInteger result = D.divide(A);
        sb.append(result);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
