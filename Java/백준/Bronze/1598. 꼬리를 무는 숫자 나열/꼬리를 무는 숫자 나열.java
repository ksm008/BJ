import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int colDiff1 = (a % 4 == 0) ? 4 : a % 4 ;
        int colDiff2 = (b % 4 == 0) ? 4 : b % 4 ;
        int colDiff = Math.abs(colDiff1 - colDiff2);

        int rowDiff1 = (a % 4 == 0) ? a / 4 - 1 : a / 4;
        int rowDiff2 = (b % 4 == 0) ? b / 4 - 1 : b / 4;
        int rowDiff = Math.abs(rowDiff2 - rowDiff1);

        int result = colDiff + rowDiff;
        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}