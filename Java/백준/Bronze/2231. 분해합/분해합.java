import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int startNum = Math.max(1, num - (9 * Integer.toString(num).length()));
        int constructor = 0;

        for (int i = startNum; i < num; i++) {
            int sum = i;
            int temp = i;

            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if (sum == num) {
                constructor = i;
                break;
            }
        }

        bw.write(Integer.toString(constructor));
        bw.flush();
        bw.close();
        br.close();
    }
}
