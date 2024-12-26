import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> burgers = new ArrayList<>();
        List<Integer> drinks = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            burgers.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(burgers);

        for (int i = 0; i < 2; i++) {
            drinks.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(drinks);

        bw.write(burgers.get(0) + drinks.get(0) - 50 + "");

        bw.flush();
        bw.close();
        br.close();
    }
}