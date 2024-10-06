import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        HashSet<String> str = new HashSet<>();

        for (int i = 0; i < num; i++) {
            str.add(br.readLine());
        }
        ArrayList<String> strList = new ArrayList<>(str);

        strList.sort(Comparator.comparingInt(String::length).thenComparing(String::compareTo));

        for (String word : strList) {
            bw.write(word);
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}