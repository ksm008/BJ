import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());
        ArrayList<Integer> cups = new ArrayList<>(List.of(1,0,0));

        for (int i = 0; i < repeat; i++) {
            String[] str = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            int temp = cups.get(B - 1);
            cups.set(B - 1, cups.get(A - 1));
            cups.set(A - 1, temp);

        }

        bw.write(cups.indexOf(1) + 1 + "");

        bw.flush();
        bw.close();
        br.close();
    }
}