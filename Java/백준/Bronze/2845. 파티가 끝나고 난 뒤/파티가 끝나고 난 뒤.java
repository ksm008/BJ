import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str1 = br.readLine().split(" ");

        int total = Integer.parseInt(str1[0]) * Integer.parseInt(str1[1]);

        String[] str2 = br.readLine().split(" ");

        for (int i = 0; i < 5; i++) {
            bw.write(Integer.parseInt(str2[i]) - total + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}