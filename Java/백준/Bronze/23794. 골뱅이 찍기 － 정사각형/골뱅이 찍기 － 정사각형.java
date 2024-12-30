import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());


            for(int j = 0; j < num + 2; j++) {
                bw.write("@");
            }
            bw.newLine();
            for (int j = 0; j < num; j++) {
                bw.write("@");
                for (int k = 0; k < num; k++) {
                    bw.write(" ");
                }
                bw.write("@");
                bw.newLine();
            }
            for(int j = 0; j < num + 2; j++) {
                bw.write("@");

            }


        bw.flush();
        bw.close();
        br.close();
    }
}
