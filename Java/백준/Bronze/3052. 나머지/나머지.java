import java.util.Arrays;
import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] divArray = new int[10];

        for (int i = 0; i < 10; i++) {
            int A = Integer.parseInt(br.readLine());
            if (A < 0 || A > 1000) {
                System.exit(0);
            }
            divArray[i] = A % 42;
        }

        int[] result = Arrays.stream(divArray).distinct().toArray();

        if (result.length == 1) {
            bw.write("1");
        } else {
            bw.write(Integer.toString(result.length));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}