import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> crain = new ArrayList<>();
        List<Integer> boxes = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            crain.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            boxes.add(Integer.parseInt(st.nextToken()));
        }

        crain.sort(Collections.reverseOrder());
        boxes.sort(Collections.reverseOrder());

        int strongestCrain = crain.get(0);
        int heaviestBox = boxes.get(0);

        if (heaviestBox > strongestCrain) {
            sb.append("-1");
        } else {
            int minute = 0;
            while (!boxes.isEmpty()) {
                for (int i = 0; i < crain.size(); i++) {
                    for (int j = 0; j < boxes.size(); j++) {
                        if (crain.get(i) >=  boxes.get(j)) {
                            boxes.remove(j);
                            break;
                        }
                    }
                }
                minute++;
            }

            sb.append(minute);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}