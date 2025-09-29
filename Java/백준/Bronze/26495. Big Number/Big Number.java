import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String[][] num = {
                {"0000", "0  0", "0  0", "0  0", "0000"},
                {"   1", "   1", "   1", "   1", "   1"},
                {"2222", "   2", "2222", "2",    "2222"},
                {"3333", "   3", "3333", "   3", "3333"},
                {"4  4", "4  4", "4444", "   4", "   4"},
                {"5555", "5",    "5555", "   5", "5555"},
                {"6666", "6",    "6666", "6  6", "6666"},
                {"7777", "   7", "   7", "   7", "   7"},
                {"8888", "8  8", "8888", "8  8", "8888"},
                {"9999", "9  9", "9999", "   9", "   9"}
        };

        String s = br.readLine().trim();

        for (int i = 0; i < s.length(); i++) {
            int d = s.charAt(i) - '0';
            for (int r = 0; r < 5; r++) {
                sb.append(num[d][r]).append('\n');
            }
            if (i < s.length() - 1) sb.append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
    }
}
