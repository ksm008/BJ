import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str = br.readLine();

        if (str.charAt(0) == '"' && str.charAt(str.length() - 1) == '"') {
            str = str.replaceAll("\"", "");
            if (str.isEmpty()) {
                sb.append("CE");

            } else {
                sb.append(str);
            }
        } else sb.append("CE");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
