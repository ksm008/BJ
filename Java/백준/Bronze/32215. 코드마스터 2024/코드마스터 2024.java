import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int result =  Integer.parseInt(str[2]) * Integer.parseInt(str[1]) + Integer.parseInt(str[1]);

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}