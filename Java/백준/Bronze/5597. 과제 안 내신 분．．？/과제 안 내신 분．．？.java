import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> num = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            num.add(i + 1);
        }

        ArrayList<Integer> inputNum = new ArrayList<>();
        for (int i = 0; i < 28; i++) {
            inputNum.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < 30; i++) {
            if (!inputNum.contains(num.get(i))) {
                bw.write(num.get(i) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}