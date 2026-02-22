import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken();
        String str2 = st.nextToken();

        int temp1;
        int temp2;

        sb.append(str1);
        sb.reverse();
        temp1 = Integer.parseInt(sb.toString());
        sb.setLength(0);

        sb.append(str2);
        sb.reverse();
        temp2 = Integer.parseInt(sb.toString());
        sb.setLength(0);

        int result = temp1 + temp2;
        sb.append(result);
        sb.reverse();
        result = Integer.parseInt(sb.toString());

        sb.setLength(0);
        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}