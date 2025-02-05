import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int price = Integer.parseInt(str[0]);
        int performance = Integer.parseInt(str[1]);
        int warPrice = Integer.parseInt(str[2]);

        int gaSeong = performance / price;
        int warPerform = gaSeong * 3 * warPrice;

        bw.write(warPerform + "");

        bw.flush();
        bw.close();
        br.close();
    }
}