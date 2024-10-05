import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean firstInput = true;
        int[] end = {0,0,0};

        while (true) {
            String[] tri = br.readLine().split(" ");

            int[] intTri = new int[tri.length];
            for (int i = 0; i < tri.length; i++) {
                intTri[i] = Integer.parseInt(tri[i]);
            }
            Arrays.sort(intTri);

            int A = intTri[0];
            int B = intTri[1];
            int C = intTri[2];

            if (A < 0 || B < 0 || C < 0 || A > 30000 || B > 30000 || C > 30000) {
                System.exit(0);
            }

            if (Arrays.equals(intTri, end)) {
                break;
            }

            boolean pytha = ((Math.pow(A, 2) + Math.pow(B, 2)) == Math.pow(C, 2));

            if (firstInput) {
                firstInput = false;
            } else {
                bw.newLine();
            }

            if (pytha) {
                bw.write("right");
            } else {
                bw.write("wrong");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}