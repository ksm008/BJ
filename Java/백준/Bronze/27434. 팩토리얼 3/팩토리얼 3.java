import java.io.*;
import java.math.BigInteger;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());

        BigInteger result;
        if (num <= 1) result = BigInteger.ONE;
        else result = rangeProd(2, num);

        sb.append(result);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static BigInteger rangeProd(int l, int r) {
        if (l > r) return BigInteger.ONE;
        if (l == r) return BigInteger.valueOf(l);
        if (r - l == 1) {
            return BigInteger.valueOf(l).multiply(BigInteger.valueOf(r));
        }
        int m = (l + r) / 2;
        BigInteger left = rangeProd(l, m);
        BigInteger right = rangeProd(m + 1, r);
        return left.multiply(right);
    }
}
