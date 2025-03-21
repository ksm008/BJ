import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int aCount = 0;
        int bCount = 0;

        for (char c : str.toCharArray()) {
            if (c == 'A') {
                aCount++;
            } else {
                bCount++;
            }
        }

        bw.write(aCount + " : " + bCount);

        bw.flush();
        bw.close();
        br.close();
    }
}