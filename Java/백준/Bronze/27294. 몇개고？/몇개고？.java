import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 진양철이 술을 마시지 않으면서 점심이면 320, 아니면 280

        String[] str = br.readLine().split(" ");

        int time = Integer.parseInt(str[0]);
        int sake = Integer.parseInt(str[1]);

        if (time >= 12 && time <= 16) {
            if (sake == 0) {
                bw.write("320");
            }
            else {
                bw.write("280");
            }
        } else {
            bw.write("280");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}