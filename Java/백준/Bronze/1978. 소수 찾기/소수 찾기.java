import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int[] numPrime = new int[num];

        for (int i = 0; i < num; i++) {
            numPrime[i] = Integer.parseInt(str[i]);
        }

        int pCnt = 0;

        for (int P : numPrime) {
            if (P == 1) {
                continue;
            }
            if (P == 2) {
                pCnt++;
                continue;
            }
            if (P % 2 == 0) {
                continue;
            }

            boolean isPrime = true;
            int sqrt = (int) Math.sqrt(P);

            for (int i = 2; i <= sqrt; i++) {
                if (P % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                pCnt++;
            }
        }

        bw.write(Integer.toString(pCnt));

        bw.flush();
        bw.close();
        br.close();
    }
}