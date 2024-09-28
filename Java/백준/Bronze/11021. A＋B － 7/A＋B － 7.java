import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i;
        int num = Integer.parseInt(br.readLine());

        for (i = 1; i < num+1; i++) {
            String[] str = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            int C = A + B;

            bw.write("Case #" + i + ": " + String.valueOf(C)+"\n");
        }
        bw.flush();
        bw.close();
    }
}