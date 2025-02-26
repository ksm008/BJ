import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int apple = Integer.parseInt(br.readLine());
        int tangerine = Integer.parseInt(br.readLine());

        bw.write(apple + tangerine + 3 + "");
        bw.flush();
        bw.close();
        br.close();
    }
}