import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String test = br.readLine();
            String[] str;
            if (test.equals("0 0 0")) {
                break;
            } else {
                str = test.split(" ");
            }

            ArrayList<Integer> tri = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                tri.add(Integer.parseInt(str[i]));
            }

            Collections.sort(tri);

            int first = tri.get(0);
            int second = tri.get(1);
            int third = tri.get(2);

            if (first + second <= third) {
                bw.write("Invalid");
            } else{
                if (first == second && second == third) {
                    bw.write("Equilateral");
                } else if (first == second || second == third || first == third) {
                    bw.write("Isosceles");
                } else {
                    bw.write("Scalene");
                }
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}