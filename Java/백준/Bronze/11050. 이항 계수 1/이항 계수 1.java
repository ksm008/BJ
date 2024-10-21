import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int nume = 1;
        int denoB = 1;
        int denoAminusB = 1;

        for (int i = A; i > 0; i--) {
            nume *= i;
        }

        for (int i = B; i > 0; i--) {
            denoB *= i;
        }

        for (int i = A - B; i > 0; i--) {
            denoAminusB *= i;
        }

        int result = nume / (denoB * denoAminusB);

        bw.write(Integer.toString(result));

        bw.flush();
        bw.close();
        br.close();
    }
}