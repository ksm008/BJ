import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        ArrayList<Integer> cardLists = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            cardLists.add(i + 1);
        }

        int cnt = 0;

        while (true) {

            if (cnt == 0) {
                bw.write(cardLists.get(0) + "");
            } else {
                bw.write(" " + cardLists.get(0));
            }

            if (cnt == num - 1) {
                break;
            }

            cardLists.remove(0);
            cardLists.add(cardLists.get(0));
            cardLists.remove(0);

            cnt++;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}