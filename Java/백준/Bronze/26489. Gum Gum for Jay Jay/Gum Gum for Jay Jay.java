import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int i = 0;
        while (true) {
            String str = br.readLine();
            if (str == null) {
                break;
            }
            i++;
        }
        sb.append(i);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
