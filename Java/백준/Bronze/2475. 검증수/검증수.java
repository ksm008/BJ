import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int length = str.length;
        int sum = 0;

        for (int i = 0; i < length; i++) {
            sum += Integer.parseInt(str[i]) * Integer.parseInt(str[i]);
        }

        bw.write(Integer.toString(sum % 10));
        bw.flush();
        bw.close();
        br.close();
    }
}