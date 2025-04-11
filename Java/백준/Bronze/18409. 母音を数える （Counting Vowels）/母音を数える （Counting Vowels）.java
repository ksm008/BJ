import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int result = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o') {
                result++;
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}