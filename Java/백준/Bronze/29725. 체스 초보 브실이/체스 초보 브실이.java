import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Character, Integer> score = new HashMap<>();
        score.put('P', 1);
        score.put('p', 1);
        score.put('N', 3);
        score.put('n', 3);
        score.put('B', 3);
        score.put('b', 3);
        score.put('R', 5);
        score.put('r', 5);
        score.put('Q', 9);
        score.put('q', 9);
        score.put('K', 0);
        score.put('k', 0);

        int white = 0;
        int black = 0;

        for (int i = 0; i < 8; i++) {
            String str = br.readLine();
            for (char c : str.toCharArray()) {
                if (c == '.') continue;
                int point = score.get(c);
                if (Character.isUpperCase(c)) {
                    white += point;
                } else {
                    black += point;
                }
            }
        }

        bw.write(white - black + "");

        bw.flush();
        bw.close();
        br.close();
    }
}