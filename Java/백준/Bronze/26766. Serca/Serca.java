import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            drawHeart();
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static void drawHeart() {
        sb.append(" @@@   @@@ ").append("\n");
        sb.append("@   @ @   @").append("\n");
        sb.append("@    @    @").append("\n");
        sb.append("@         @").append("\n");
        sb.append(" @       @ ").append("\n");
        sb.append("  @     @  ").append("\n");
        sb.append("   @   @   ").append("\n");
        sb.append("    @ @    ").append("\n");
        sb.append("     @     ").append("\n");
    }
}
