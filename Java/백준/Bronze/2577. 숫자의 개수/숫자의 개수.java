import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        if (A < 100 || B < 100 || C < 100 || A > 1000 || B > 1000 || C > 1000) {
            System.exit(0);
        }

        String result = Integer.toString(A * B * C);

        int[] resultNum = new int[10];

        for (int i = 0; i < 10; i++) {
            resultNum[i] = 0;
        }

        char[] resultChar = result.toCharArray();

        for (char c : resultChar) {
            resultNum[Character.getNumericValue(c)] += 1;
        }

        for (int j = 0; j < 10; j++) {
            if (j == 9) {
                bw.write(Integer.toString(resultNum[j]));
            } else {
                bw.write(resultNum[j] + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}