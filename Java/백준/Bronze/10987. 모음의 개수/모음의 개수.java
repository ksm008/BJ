import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int result = 0;

        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u') {
                result++;
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}