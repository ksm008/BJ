import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int A = Integer.parseInt(str[0]) * Integer.parseInt(str[1]);
        int B = Integer.parseInt(str[2]) * Integer.parseInt(str[3]) * Integer.parseInt(str[4]);

        bw.write(Integer.toString(A - B));

        bw.flush();
        bw.close();
        br.close();
    }
}