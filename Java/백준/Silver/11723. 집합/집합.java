import java.io.*;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        newSet newSet = new newSet();

        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            int number = 0;
            if (st.hasMoreTokens()) {
                number = Integer.parseInt(st.nextToken());
            }

            switch (cmd) {
                case "add":
                    newSet.add(number);
                    break;
                case "remove":
                    newSet.remove(number);
                    break;
                case "check":
                    newSet.check(number);
                    break;
                case "empty":
                    newSet.empty();
                    break;
                case "all":
                    newSet.all();
                    break;
                case "toggle":
                    newSet.toggle(number);
                    break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static private class newSet {
        Set<Integer> set;

        private newSet() {
            set = new HashSet<>();
        }

        private void add(int x) {
            set.add(x);
        }

        private void remove(int x) {
            set.remove(x);
        }

        private void empty() {
            set.clear();
        }

        private void all() {
            set.clear();
            for (int i = 1; i <= 20; i++) set.add(i);
        }

        private void check(int x) throws IOException {
            if (set.contains(x)) {
                bw.write("1\n");
            } else {
                bw.write("0\n");
            }
        }

        private void toggle(int x) {
            if (set.contains(x)) set.remove(x);
            else set.add(x);
        }
    }
}
