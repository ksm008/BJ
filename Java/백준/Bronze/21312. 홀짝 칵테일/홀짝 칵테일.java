import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        ArrayList<Integer> cocktails = new ArrayList<>();

        for (String num : str) {
            cocktails.add(Integer.parseInt(num));
        }

        cocktails.add(cocktails.get(0) * cocktails.get(1));
        cocktails.add(cocktails.get(1) * cocktails.get(2));
        cocktails.add(cocktails.get(0) * cocktails.get(2));
        cocktails.add(cocktails.get(0) * cocktails.get(1) * cocktails.get(2));
        Collections.sort(cocktails);
        ArrayList<Integer> candidates = new ArrayList<>();

        for (int num : cocktails) {
            if (num % 2 != 0) {
                candidates.add(num);
            }
        }

        if (candidates.isEmpty()) {
            bw.write(cocktails.get(cocktails.size() - 1).toString());
        } else {
            bw.write(candidates.get(candidates.size() - 1).toString());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}






