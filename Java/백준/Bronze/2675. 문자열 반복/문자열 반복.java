import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            if (num <= 0 || num > 1000) {
                break;
            }

            String[] str = br.readLine().split(" ");
            int repeatNum = Integer.parseInt(str[0]);
            String text = str[1];

            if (repeatNum <= 0 || repeatNum > 8) {
                break;
            }
            if (text.length() <= 0 || text.length() > 20) {
                break;
            }

            for (int j = 0; j < text.length(); j++) {
                for (int k = 0; k < repeatNum; k++)
                    bw.write(text.charAt(j));
            }

            if (i != num - 1) {
                bw.newLine();
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}