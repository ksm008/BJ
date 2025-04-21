import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int apple = Integer.parseInt(str[0]);
        int banana = Integer.parseInt(str[1]);

        for (int i = 1; i <= Math.max(apple,banana); i++) {
            if (apple % i == 0 && banana % i == 0) {
                bw.write(i + " " + apple / i + " " + banana / i + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
