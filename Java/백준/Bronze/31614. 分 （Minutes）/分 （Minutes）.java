import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int hour = Integer.parseInt(br.readLine());
        int min = Integer.parseInt(br.readLine());

        bw.write(hour * 60 + min + "");
        bw.flush();
        bw.close();
        br.close();
    }
}