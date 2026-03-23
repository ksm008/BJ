import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 0;
        int X = Integer.parseInt(br.readLine()) / 4;

        for (i = 0; i < X;i++) {
            bw.write("long ");
        }
        bw.write("int\n");
        bw.close();
    }
}