import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int N = Integer.parseInt(br.readLine());
        boolean isIn = false;
        
        outer:
        for (int i = 2; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (N == i || N == j || N == i * j) {
                    sb.append("1");
                    isIn = true;
                    break outer;
                }
            }
        }

        if (!isIn) sb.append("0");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}