import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int reversedA = 0, reversedB = 0;

        while (A != 0 && B != 0) {
            int digitA = A % 10;
            int digitB = B % 10;
            reversedA = reversedA * 10 + digitA;
            reversedB = reversedB * 10 + digitB;
            A /= 10;
            B /= 10;
        }

        if (reversedA > reversedB) {
            bw.write(Integer.toString(reversedA));
        } else {
            bw.write(Integer.toString(reversedB));
        }
        bw.flush();
        bw.close();
        br.close();
    }
}