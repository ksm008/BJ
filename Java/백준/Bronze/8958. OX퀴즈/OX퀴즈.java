import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            if (str.length() < 0 || str.length() > 80) {
                System.exit(0);
            }
            char[] c = new char[str.length()];
            int result = 0, score = 0;

            for (int j = 0; j < str.length(); j++) {
                c[j] = str.charAt(j);
                if (Character.toString(c[j]).equals("O")) {
                    score += 1;
                    result += score;
                } else {
                    score = 0;
                }
            }

            if (i == num - 1) {
                bw.write(Integer.toString(result));
            } else {
                bw.write((result + "\n"));
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}