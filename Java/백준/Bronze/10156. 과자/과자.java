import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int snack = Integer.parseInt(str[0]);
        int num = Integer.parseInt(str[1]);
        int money = Integer.parseInt(str[2]);

        int result = snack * num - money;

        if (result > 0) {
            bw.write(result + "");
        } else {
            bw.write("0");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}