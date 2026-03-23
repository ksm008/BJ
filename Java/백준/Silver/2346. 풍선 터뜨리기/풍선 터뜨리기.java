import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int idx = 0;
        String[] str = br.readLine().split(" ");
        ArrayList<Integer> balloons = new ArrayList<>();
        ArrayList<Integer> blnidx = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            balloons.add(Integer.parseInt(str[i]));
            blnidx.add(i + 1);
        }

        while (!blnidx.isEmpty()) {
            int blncurr = blnidx.get(idx);
            result.add(blncurr);
            int M = balloons.get(blncurr - 1);
            blnidx.remove(idx);

            if (blnidx.isEmpty()) {
                break;
            }

            if (M > 0) {
                idx = (idx + (M - 1)) % blnidx.size();
            } else {
                idx = (idx + M) % blnidx.size();
                if (idx < 0) {
                    idx += blnidx.size();
                }
            }
        }

        for (int r : result) {
            bw.write(r + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
