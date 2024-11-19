import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int chicken = Integer.parseInt(br.readLine());
        int sum = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);

        if (sum >= chicken * 2) {
            bw.write(Integer.toString(sum - chicken * 2));
        } else {
            bw.write(Integer.toString(sum));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}