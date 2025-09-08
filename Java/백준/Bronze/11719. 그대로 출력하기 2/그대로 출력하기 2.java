import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        while (true) {
            String str = br.readLine();
            if (str==null) break;
            else sb.append(str).append("\n");
        }    

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}