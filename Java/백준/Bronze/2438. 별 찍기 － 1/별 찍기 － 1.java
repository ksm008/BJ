import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i, j;
        int num = Integer.parseInt(br.readLine());

        for (i = 0; i < num; i++) {
            for (j = 0; j < i+1; j++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}