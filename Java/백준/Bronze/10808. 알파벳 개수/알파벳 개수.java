import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] alphabetArray = new int[26];

        String str = br.readLine();

        for (char c : str.toCharArray()) {
            alphabetArray[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (i == 25) {
                bw.write(alphabetArray[i] + "");
            } else {
                bw.write(alphabetArray[i] + " ");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}