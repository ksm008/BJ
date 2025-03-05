import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int red = Integer.parseInt(br.readLine());
        int green = Integer.parseInt(br.readLine());
        int blue = Integer.parseInt(br.readLine());

        bw.write(red * 3 + green * 4 + blue * 5 + "");

        bw.flush();
        bw.close();
        br.close();
    }
}