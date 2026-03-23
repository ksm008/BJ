import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int temp = Integer.parseInt(st.nextToken());
            list.add(temp);
        }

        TreeSet<Integer> set = new TreeSet<>(list);

        ArrayList<Integer> sortedList = new ArrayList<>(set);
        int listLen = sortedList.size();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < listLen; i++) {
            map.put(sortedList.get(i), i);
        }

        for (int i = 0; i < N; i++) {
            if (i != N - 1) {
                sb.append(map.get(list.get(i))).append(" ");
            } else {
                sb.append(map.get(list.get(i)));
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
