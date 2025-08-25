import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        double result1 = 100.0 / num;
        double result2 = 100.0 / (100 - num);

        bw.write(String.format("%.10f%n", result1));
        bw.write(String.format("%.10f", result2));

        bw.flush();
        bw.close();
        br.close();
    }
}