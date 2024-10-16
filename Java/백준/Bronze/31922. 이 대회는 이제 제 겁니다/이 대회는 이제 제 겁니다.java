import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int div1 = Integer.parseInt(str[0]);
        int div2 = Integer.parseInt(str[1]);
        int shake = Integer.parseInt(str[2]);

        int max = Math.max(div1 + shake, div2);

        bw.write(Integer.toString(max));

        bw.flush();
        bw.close();
        br.close();
    }
}