import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int result = (int) Math.sqrt(num);

        bw.write("The largest square has side length " + result + ".");

        bw.flush();
        bw.close();
        br.close();
    }
}