import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        String[] idxToName = new String[N + 1];
        Map<String, Integer> nameToIdx = new HashMap<>();

        for (int i = 1; i <= N; i++) {
            String name = br.readLine();
            idxToName[i] = name;
            nameToIdx.put(name, i);
        }

        for (int i = 0; i < M; i++) {
            String question = br.readLine();

            if (isNum(question)) {
                int idx = Integer.parseInt(question);
                bw.write(idxToName[idx] + "\n");
            } else {
                bw.write(nameToIdx.get(question) + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isNum(String s) {
        return s.chars().allMatch(Character::isDigit);
    }
}