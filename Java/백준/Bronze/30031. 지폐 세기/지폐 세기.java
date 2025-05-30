import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            int width = Integer.parseInt(str[0]);

            if (width == 136) result += 1000;
            else if (width == 142) result += 5000;
            else if (width == 148) result += 10000;
            else if (width == 154) result += 50000;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
