import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int startDonut = Integer.parseInt(br.readLine());
        int event = Integer.parseInt(br.readLine());

        for (int i = 0; i < event; i++) {
            char ch =  br.readLine().charAt(0);
            int donut = Integer.parseInt(br.readLine());
            if (ch == '+') startDonut += donut;
            else startDonut -= donut;
        }

        sb.append(startDonut);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
