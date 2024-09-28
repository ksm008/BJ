import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int i, result = 0;
        int num = Integer.parseInt(br.readLine());

        for (i = 1;i < num + 1;i++) {
            result += i;
        }

        System.out.println(result);
    }
}