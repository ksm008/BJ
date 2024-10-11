import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<String> grade = new ArrayList<>(Arrays.asList("A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"));
        Double[] score = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0};
        double totalCredits = 0.0, weightedScoreSum = 0.0;

        for (int i = 0; i < 20; i++) {
            String[] input = br.readLine().split(" ");
            String subjectGrade = input[2];
            double credits = Double.parseDouble(input[1]);

            if (subjectGrade.equals("P")) {
                continue;
            }

            int gradeIdx = grade.indexOf(subjectGrade);
            weightedScoreSum += credits * score[gradeIdx];
            totalCredits += credits;
        }
        bw.write(String.format("%.6f\n", weightedScoreSum / totalCredits));
        bw.flush();
        bw.close();
        br.close();
    }
}
