import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");

        int year1 = Integer.parseInt(str[0]);
        int year2 = Integer.parseInt(str[1]);
        int lastYear = Integer.parseInt(str[N - 1]);
        int diff = year2 - year1;

        sb.append(lastYear + diff);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
