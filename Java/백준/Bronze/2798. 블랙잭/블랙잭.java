import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str1 = br.readLine().split(" ");
        int totalCards = Integer.parseInt(str1[0]);
        int MAX = Integer.parseInt(str1[1]);

        String[] str2 = br.readLine().split(" ");
        int[] cards = new int[totalCards];
        for (int i = 0; i < totalCards; i++) {
            cards[i] = Integer.parseInt(str2[i]);
        }

        int result = 0;

        for (int i = 0; i < totalCards - 2; i++) {
            for (int j = i + 1; j < totalCards - 1; j++) {
                for (int k = j + 1; k < totalCards; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= MAX && sum > result) {
                        result = sum;
                    }
                }
            }
        }

        bw.write(Integer.toString(result));
        bw.flush();
        bw.close();
        br.close();
    }
}