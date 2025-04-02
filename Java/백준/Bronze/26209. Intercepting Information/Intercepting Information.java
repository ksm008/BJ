import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        boolean isBit = true;

        for (String s : str) {
            if (s.equals("0") || s.equals("1")) {
                continue;
            } else {
                isBit = false;
                break;
            }
        }

        if (isBit) bw.write("S");
        else bw.write("F");


        bw.flush();
        bw.close();
        br.close();
    }
}