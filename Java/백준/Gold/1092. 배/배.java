import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Integer[] crane = new Integer[N];

        for (int i = 0; i < N; i++) {
            crane[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        Integer[] boxes = new Integer[M];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            boxes[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(crane, Collections.reverseOrder());
        Arrays.sort(boxes, Collections.reverseOrder());

        int strongestCrain = crane[0];
        int heaviestBox = boxes[0];

        if (heaviestBox > strongestCrain) {
            sb.append("-1");
        } else {
            boolean[] checked = new boolean[M];
            int[] pos = new int[N];
            int moved = 0;
            int minute = 0;

            while (moved < M) {
                for (int i = 0; i < N; i++) {
                    while (pos[i] < M) {
                        if (!checked[pos[i]] && crane[i] >= boxes[pos[i]]) {
                            checked[pos[i]] = true;
                            pos[i]++;
                            moved++;
                            break;
                        } else {
                            pos[i]++;
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