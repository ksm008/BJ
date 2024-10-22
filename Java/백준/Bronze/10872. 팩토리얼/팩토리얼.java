import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int temp = 1;

        if (num != 0) {
            for (int i = num; i > 0; i--) {
                temp *= i;
            }
            bw.write(Integer.toString(temp));
        } else {
            bw.write("1");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}