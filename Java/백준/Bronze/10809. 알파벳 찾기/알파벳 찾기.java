import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        if (str.length() > 100) {
            System.exit(0);
        }

        char[] lowerCheck = str.toCharArray();
        int[] alphabet = new int[26];

        for (int i = 0; i < 26 ; i++) {
            alphabet[i] = -1;
        }

        for (char c : lowerCheck) {
            if (!Character.isLowerCase(c)) {
                System.exit(0);
            }
            int alphaASCII = ((int) c) - 97;
            if (alphabet[alphaASCII] != -1) {
                continue;
            } else {
                alphabet[alphaASCII] = (str.indexOf(c));
            }
        }

        for (int j = 0;j < 26; j++) {
            if (j == 25) {
                bw.write(Integer.toString(alphabet[j]));
            } else {
                bw.write(alphabet[j] + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}