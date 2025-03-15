import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        String str = br.readLine();

        for (int i = 0; i < num; i++) {
            if (str.charAt(i) == 'J') {
                bw.write("O");
            } else if (str.charAt(i) == 'O') {
                bw.write("I");
            } else {
                bw.write("J");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}