import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int box = 1;
        int count = 0;

        for (int i = 0; i < num; i++) {
            char move = str.charAt(i);

            if (move == 'L') {
                box = Math.max(1, box - 1);
            } else if (move == 'R') {
                box = Math.min(3, box + 1);
            }

            if (box == 3) {
                count++;
            }
        }

        bw.write(count + "");

        bw.flush();
        bw.close();
        br.close();
    }
}