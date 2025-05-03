import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //2n - 1줄 입력 = 시나리오당 1명만 귀걸이를 돌려받지 못함.
        //뒤에 오는 알파벳은 무시하고 숫자가 2번 입력되지 않은 학생만 출력하면 됨...

        int scenario = 1;

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                break;
            }

            String[] lists = new String[num];

            for (int i = 0; i < num; i++) {
                lists[i] = br.readLine();
            }

            ArrayList<Integer> idxLists = new ArrayList<>();
            for (int i = 0; i < num * 2 - 1; i++) {
                String[] str = br.readLine().split(" ");
                int index = Integer.parseInt(str[0]);

                if (!idxLists.contains(index)) idxLists.add(index);
                else idxLists.remove(idxLists.indexOf(index));
            }

            bw.write(scenario + " " + lists[idxLists.get(0) - 1] + "\n");
            scenario++;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
