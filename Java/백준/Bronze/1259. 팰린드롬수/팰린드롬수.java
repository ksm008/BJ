import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) break;
            int result = 0, numCpy = num;
            while(numCpy!=0) {
                result = result * 10 + numCpy % 10;
                numCpy /= 10;
            }

            if (num == result) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
