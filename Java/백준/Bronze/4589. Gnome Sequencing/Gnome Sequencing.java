import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 삼항연산자 쓰는 습관도 들여보기

        int num = Integer.parseInt(br.readLine());

        bw.write("Gnomes:\n");

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().trim().split(" ");
            int a = Integer.parseInt(str[0]);
            int b = Integer.parseInt(str[1]);
            int c = Integer.parseInt(str[2]);

            boolean ordered = (a < b && b < c) || (a > b && b > c);
            bw.write(ordered ? "Ordered\n" : "Unordered\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
