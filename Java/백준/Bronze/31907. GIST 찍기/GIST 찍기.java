import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {

            for (char ch : "G...".toCharArray()) {

                for (int j = 0; j < num; j++) {

                    bw.write(ch);

                }

            }

            bw.newLine();

        }

        for (int i = 0; i < num; i++) {

            for (char ch : ".I.T".toCharArray()) {

                for (int j = 0; j < num; j++) {

                    bw.write(ch);

                }

            }

            bw.newLine();

        }

        for (int i = 0; i < num; i++) {

            for (char ch : "..S.".toCharArray()) {

                for (int j = 0; j < num; j++) {

                    bw.write(ch);

                }

            }

            bw.newLine();

        }

        bw.flush();

        br.close();

        bw.close();

    }

}