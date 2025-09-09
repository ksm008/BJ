import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < num; i++) {
            int grade = Integer.parseInt(br.readLine());
            if (grade % 2 != 0) {
                cnt++;
            }
        }
        sb.append(cnt);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
