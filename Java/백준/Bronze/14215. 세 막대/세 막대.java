import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int[] triangle = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            triangle[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(triangle);

        int result = 0;

        if (triangle[0] + triangle[1] > triangle[2]) {
            result = triangle[0] + triangle[1] + triangle[2];
        } else result = (triangle[0] + triangle[1]) * 2 - 1;

        sb.append(result);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}