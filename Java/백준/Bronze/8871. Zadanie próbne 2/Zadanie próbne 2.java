import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int min = (num + 1) * 2;
        int max = (num + 1) * 3;

        bw.write(min + " " + max);

        bw.flush();
        bw.close();
        br.close();
    }
}