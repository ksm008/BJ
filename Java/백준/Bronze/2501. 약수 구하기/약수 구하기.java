import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        List<Integer> div = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                div.add(i);
            }
        }

        if (div.size() >= K) {
            bw.write(div.get(K - 1) + "");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
