import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");

            int point = Integer.parseInt(str[0]);
            int line = Integer.parseInt(str[1]);

            int area = line - point + 2;
            bw.write(area + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
