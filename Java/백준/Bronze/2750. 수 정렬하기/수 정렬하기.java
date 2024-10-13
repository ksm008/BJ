import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        ArrayList<Integer> numList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            numList.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(numList);

        for (int i = 0; i < num; i++) {
            bw.write(numList.get(i) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}