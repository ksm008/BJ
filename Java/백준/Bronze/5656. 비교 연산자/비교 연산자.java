import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int cnt = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            String operator = st.nextToken();
            int B = Integer.parseInt(st.nextToken());

            if (operator.equals("E")) break;
            sb.append("Case ").append(cnt).append(": ");

            switch (operator) {
                case ">":
                    sb.append(A > B ? "true" : "false");
                    break;
                case "<":
                    sb.append(A < B ? "true" : "false");
                    break;
                case "==":
                    sb.append(A == B ? "true" : "false");
                    break;
                case "!=":
                    sb.append(A != B ? "true" : "false");
                    break;
                case ">=":
                    sb.append(A >= B ? "true" : "false");
                    break;
                case "<=":
                    sb.append(A <= B ? "true" : "false");
                    break;
            }
            sb.append("\n");
            cnt++;
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
