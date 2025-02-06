import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int repeat = Integer.parseInt(str[0]);
        int length = Integer.parseInt(str[1]);
        int result = 0;

        for (int i = 0; i < repeat; i++) {
            String str1 = br.readLine();
            int oCount = 0;
            int xCount = 0;

            for (char c : str1.toCharArray()) {
                if (c == 'O') {
                    oCount++;
                } else {
                    xCount++;
                }
            }

            if (oCount >= (length + 1) / 2) {
                result++;
            }
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}