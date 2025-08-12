import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long num = Long.parseLong(br.readLine());

        int[] pattern = {1,2,3,4,5,4,3,2};

        bw.write(pattern[(int)((num - 1) % 8)] + "");

        bw.flush();
        bw.close();
        br.close();
    }
}