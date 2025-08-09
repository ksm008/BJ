import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(str[2]);
        int D = Integer.parseInt(br.readLine());

        int start = A * 3600 + B * 60 + C;
        int end = (start + D) % 86400;

        int h = end / 3600;
        int m = (end % 3600) / 60;
        int s = end % 60;

        bw.write(h + " " + m + " " + s);
        bw.flush();
        bw.close();
        br.close();
    }
}
