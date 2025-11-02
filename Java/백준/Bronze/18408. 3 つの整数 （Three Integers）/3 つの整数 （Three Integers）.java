import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String[] str = br.readLine().split(" ");

        int oneCnt = 0;
        int twoCnt = 0;

        for (String i : str) {
            int N = Integer.parseInt(i);
            if (N == 1) oneCnt++;
            else twoCnt++;
        }

        sb.append(oneCnt > twoCnt ? "1" : "2");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}