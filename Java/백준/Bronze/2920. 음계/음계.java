import java.io.*;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");

        String[] ascending = num.clone();
        String[] descending = num.clone();

        Arrays.sort(ascending);
        Arrays.sort(descending,Collections.reverseOrder());

        if (Arrays.equals(num, ascending)) {
            bw.write("ascending");
        } else if (Arrays.equals(num, descending)) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}