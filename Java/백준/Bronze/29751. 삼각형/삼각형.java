import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        double A = Double.parseDouble(str[0]);
        double B = Double.parseDouble(str[1]);

        String result = String.format("%.1f", A * B / 2);

        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }
}