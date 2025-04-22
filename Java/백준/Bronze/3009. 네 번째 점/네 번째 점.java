import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String[] str = br.readLine().split(" ");
            int pointX = Integer.parseInt(str[0]);
            int pointY = Integer.parseInt(str[1]);

            if (x.contains(pointX)) {
                x.remove(x.indexOf(pointX));
            } else {
                x.add(pointX);
            }

            if (y.contains(pointY)) {
                y.remove(y.indexOf(pointY));
            } else {
                y.add(pointY);
            }
        }

        bw.write(x.get(0) + " " + y.get(0));

        bw.flush();
        bw.close();
        br.close();
    }
}