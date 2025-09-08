import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BigInteger S = new BigInteger(br.readLine());
        BigInteger D = new BigInteger(br.readLine());

        BigInteger klaudia = (S.add(D)).divide(BigInteger.valueOf(2));
        BigInteger natalia = (S.subtract(D)).divide(BigInteger.valueOf(2));

        sb.append(klaudia).append("\n").append(natalia);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}