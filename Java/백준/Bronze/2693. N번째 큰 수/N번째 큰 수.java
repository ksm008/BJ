import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            String[] str = br.readLine().split(" ");

            for (int j = 0; j < 10; j++) {
                list.add(Integer.parseInt(str[j]));
            }

            Collections.sort(list, Collections.reverseOrder());

            bw.write(list.get(2) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
