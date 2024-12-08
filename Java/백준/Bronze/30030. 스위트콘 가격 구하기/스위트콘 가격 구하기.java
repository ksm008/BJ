import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int price = Integer.parseInt(br.readLine());
        int tax = price / 11;

        int finalPrice = price - tax;

        bw.write(Integer.toString(finalPrice));
        bw.flush();
        bw.close();
        br.close();
    }
}