import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        long A = Long.parseLong(str[0]);
        long B = Long.parseLong(str[1]);
        long result = (A + B) * (A - B);

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}