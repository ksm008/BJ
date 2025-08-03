import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] fixed = {9, 7, 8, 0, 9, 2, 1, 4, 1, 8};
        int[] isbn = new int[13];

        for (int i = 0; i < 10; i++) {
            isbn[i] = fixed[i];
        }

        for (int i = 10; i < 13; i++) {
            isbn[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0;

        for (int i = 0; i < 13; i++) {
            if (i % 2 == 0) {
                sum += isbn[i] * 1;
            } else {
                sum += isbn[i] * 3;
            }
        }

        bw.write("The 1-3-sum is " + sum);
        bw.flush();
        bw.close();
        br.close();
    }
}
