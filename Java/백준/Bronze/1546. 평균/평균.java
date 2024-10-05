import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        if (num > 1000 || num <= 0) {
            System.exit(0);
        }

        String[] str = br.readLine().split(" ");
        double[] score = new double[num];
        double[] newScore = new double[num];
        boolean overZero = false;

        for (int i = 0; i < num; i++) {
            score[i] = Double.parseDouble(str[i]);
            if (score[i] > 100 || score[i] < 0) {
                System.exit(0);
            }
            if (score[i] > 0) {
                overZero = true;
            }
        }

        if (overZero == false) {
            System.exit(0);
        }

        Arrays.sort(score);

        for (int j = 0; j < num; j++) {
            newScore[j] = (score[j] / score[score.length - 1]) * 100;
        }

        double average = Arrays.stream(newScore).average().orElse(0);

        System.out.println(average);

        bw.flush();
        bw.close();
        br.close();
    }
}