import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // BigInteger 사용하는 문제. BigInteger의 계산은 따로 메소드를 통해 진행함.

        String[] str = br.readLine().split(" ");

        BigInteger num1 = new BigInteger(str[0]);
        BigInteger num2 = new BigInteger(str[1]);

        bw.write(num1.divide(num2) + "\n");
        bw.write(num1.remainder(num2) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
