import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> pointArray = new ArrayList<>();

        int[] pointIdx = new int[5];
        int result = 0;

        for (int i = 0; i < 8; i++) {
            int point = Integer.parseInt(br.readLine());
            pointArray.add(point);
        }

        ArrayList<Integer> pointSortedArray = new ArrayList<>(pointArray);

        Collections.sort(pointSortedArray, Collections.reverseOrder());

        for (int i = 0; i < 5; i++) {
            result += pointSortedArray.get(i);
            pointIdx[i] = pointArray.indexOf(pointSortedArray.get(i)) + 1;
        }

        Arrays.sort(pointIdx);

        bw.write(result + "\n");

        for (int i = 0; i < 5; i++) {
            bw.write(pointIdx[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}