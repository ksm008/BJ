import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        ArrayList<int[]> loc = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            loc.add(new int[]{Integer.parseInt(str[0]), Integer.parseInt(str[1])});
        }

        Collections.sort(loc, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return Integer.compare(o1[0], o2[0]);
                }
                return Integer.compare(o1[1], o2[1]);
            }
        });

        for (int[] point : loc) {
            bw.write(point[0] + " " + point[1]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}