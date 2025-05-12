import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 그냥 형식에 맞추어 출력...

        int num = Integer.parseInt(br.readLine());


        for (int i = 0; i < num * 2; i++) {
            for (int j = 0; j < num; j++) {
                bw.write("@");
            }
            for (int j = 0; j < num * 3; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < num; j++) {
                bw.write("@");
            }
            bw.newLine();
        }
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num * 5; j++) {
                bw.write("@");
            }
            bw.newLine();
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                bw.write("@");
            }
            for (int j = 0; j < num * 3; j++) {
                bw.write(" ");
            }
            for (int j = 0; j < num; j++) {
                bw.write("@");
            }
            bw.newLine();
        }
        for (int i = 0; i < num; i++){
            for (int j = 0; j < num * 5; j++) {
                bw.write("@");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
