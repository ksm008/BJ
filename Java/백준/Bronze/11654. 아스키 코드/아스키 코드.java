import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        char c = str.charAt(0);
        int num = c;

        bw.write(Integer.toString(num));

        bw.flush();
        bw.close();
        br.close();
    }
}