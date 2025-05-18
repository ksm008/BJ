import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 덧셈 비교

        String[] str = br.readLine().split(" ");

        if (Integer.parseInt(str[0]) + Integer.parseInt(str[1]) == Integer.parseInt(str[2])) {
            bw.write("correct!");
        } else {
            bw.write("wrong!");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}