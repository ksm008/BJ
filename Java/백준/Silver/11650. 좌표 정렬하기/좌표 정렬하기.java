import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        List<Point> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);

            list.add(new Point(x, y));
        }

        list.sort((p1, p2) -> {
            if (p1.x != p2.x) return p1.x - p2.x;
            else return p1.y - p2.y;
        });

        for (Point p : list) {
            bw.write(p.x + " " + p.y + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}