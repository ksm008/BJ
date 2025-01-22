import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String str = br.readLine();

            if (str.equals("0 0")) {
                break;
            }

            String[] friends = str.split(" ");

            bw.write(Integer.parseInt(friends[0]) + Integer.parseInt(friends[1]) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}