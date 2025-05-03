import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        int side = (int) Math.pow(2 , num) + 1;
        int result = side * side;

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
