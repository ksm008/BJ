import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");
        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);

        if (N < 1 || M < 1 || N > 100 || M > 100) {
            System.exit(0);
        }

        int[] basket = new int[N];
        for (int i = 0; i < N; i++) {
            basket[i] = i + 1;
        }

        for (int j = 0; j < M; j++) {
            String[] ex = br.readLine().split(" ");
            int A = Integer.parseInt(ex[0]);
            int B = Integer.parseInt(ex[1]);

            if (A < 1 || B < 1 || A > N || B > N) {
                System.exit(0);
            } else {
                A -= 1;
                B -= 1;
            }
            int temp = basket[A];
            basket[A] = basket[B];
            basket[B] = temp;
        }

        for (int k = 0; k < N; k++) {
            if (k == basket.length - 1) {
                bw.write(Integer.toString(basket[k]));
            } else {
                bw.write(basket[k] + " ");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}