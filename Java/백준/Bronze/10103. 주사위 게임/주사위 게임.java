import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int A = 100, B = 100;

        for (int i = 0; i < num; i++) {

            String[] str = br.readLine().split(" ");

            int aNum = Integer.parseInt(str[0]);

            int bNum = Integer.parseInt(str[1]);

            if (aNum > bNum) {

                B -= aNum;

            } else if (bNum > aNum) {

                A -= bNum;

            }

        }

        bw.write(A + "\n" + B);

        bw.flush();

        br.close();

        bw.close();

    }

}