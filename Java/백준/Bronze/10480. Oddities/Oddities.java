import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num % 2 == 0) {
                bw.write(num+ " is even");
            } else {
                bw.write(num + " is odd");
            }
            if (i != repeat - 1) {
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}