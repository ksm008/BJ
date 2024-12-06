import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        if (num >= 1 && num <= 5) {
            bw.write("1");
        } else {
            int dist = num / 5;
            if (num % 5 == 0) {
                bw.write(Integer.toString(dist));
            } else {
                bw.write(Integer.toString(dist + 1));
            }

        }

        bw.flush();
        bw.close();
        br.close();
    }
}