import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int coins = Integer.parseInt(str[0]) * 100;
        int choco =Integer.parseInt(str[1]);

        if (coins >= choco) {
            bw.write("Yes");
        } else {
            bw.write("No");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}