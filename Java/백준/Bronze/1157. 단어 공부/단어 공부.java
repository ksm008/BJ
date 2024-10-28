import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        char maxChar = '?';
        int maxCount = 0;
        boolean isMultiple = false;

        for (char c : freq.keySet()) {
            int count = freq.get(c);
            if (count > maxCount) {
                maxCount = count;
                maxChar = c;
                isMultiple = false;
            } else if (count == maxCount) {
                isMultiple = true;
            }
        }

        if (isMultiple) {
            bw.write("?");
        } else {
            bw.write(maxChar);
        }

        bw.flush();
        bw.close();
        br.close();
    }
}