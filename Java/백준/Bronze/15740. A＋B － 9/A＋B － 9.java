import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        BigInteger A = new BigInteger(str[0]);
        BigInteger B = new BigInteger(str[1]);

        BigInteger result = A.add(B);

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}