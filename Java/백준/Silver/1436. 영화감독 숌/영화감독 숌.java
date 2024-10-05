import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int dooms = 666;
        int count = 0;

        while (true) {
            if (String.valueOf(dooms).contains("666")) {
                count++;
            }
            if (count == num) {
                bw.write(Integer.toString(dooms));
                break;
            }
            dooms++;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}