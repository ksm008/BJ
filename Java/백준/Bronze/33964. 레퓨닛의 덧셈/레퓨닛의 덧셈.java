import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 숫자만큼 올려주면 된다...

        String[] str = br.readLine().split(" ");
        int n1 = Integer.parseInt(str[0]), n2 = Integer.parseInt(str[1]);
        int repu1 = 1, repu2 = 1;

        if (n1 > 1) {
            for (int i = 0; i < n1 - 1; i++) {
                repu1 *= 10;
                repu1++;
            }
        }

        if (n2 > 1) {
            for (int i = 0; i < n2 - 1; i++) {
                repu2 *= 10;
                repu2++;
            }
        }

        bw.write(repu1 + repu2 + "");

        bw.flush();
        bw.close();
        br.close();
    }
}