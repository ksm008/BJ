import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");

        int N = Integer.parseInt(num[0]);
        int M = Integer.parseInt(num[1]);
        int[] basket = new int[N];

        if (N <= 0 || N > 100) {
            System.exit(0);
        } else if (M <= 0 || M > 100) {
            System.exit(0);
        }

        for (int i = 0; i < M; i++) {
            String[] command = br.readLine().split(" ");
            int start = Integer.parseInt(command[0]);
            int end = Integer.parseInt(command[1]);
            int ballNum = Integer.parseInt(command[2]);

            if (start > N || end > N || ballNum > N || start > end || start <= 0 || end <= 0 || ballNum <= 0) {
                System.exit(0);
            }

            for (int j = start; j <= end; j++) {
                basket[j - 1] = ballNum;
            }
        }
        for (int k = 0; k < N; k++) {
            bw.write(basket[k] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}