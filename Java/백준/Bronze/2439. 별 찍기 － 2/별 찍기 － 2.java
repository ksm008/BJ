import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i, j, k;
        int num = Integer.parseInt(br.readLine());

        for (i = 0; i < num; i++) {
            for (j = num-i; j > 1; j--) {
                bw.write(" ");
            }
            for (k = 0; k < i+1; k++) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}