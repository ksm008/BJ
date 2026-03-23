import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());

        int lv = Integer.parseInt(st.nextToken());
        String str = st.nextToken();

        switch (str) {
            case "miss":
                lv = 0;
                break;
            case "bad":
                lv *= 200;
                break;
            case "cool":
                lv *= 400;
                break;
            case "great":
                lv *= 600;
                break;
            case "perfect":
                lv *= 1000;
                break;
        }

        sb.append(lv);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}