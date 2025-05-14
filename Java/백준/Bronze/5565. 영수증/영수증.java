import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 총 가격에서 9권들의 가격들을 더한 값을 빼서 읽을 수 없는 책의 가격을 출력...

        int num = Integer.parseInt(br.readLine());
        int result = 0;
        for (int i = 0; i < 9; i++) {
            result += Integer.parseInt(br.readLine());
        }

        bw.write(num - result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
