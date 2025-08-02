import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int plugs = 0;

        for (int i = 0; i < num; i++) {
            int plug = Integer.parseInt(br.readLine());
            plugs += plug;
        }

        int result = plugs - (num - 1);
        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();

    }
}
