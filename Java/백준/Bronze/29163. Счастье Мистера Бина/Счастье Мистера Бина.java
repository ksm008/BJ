import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int repeatNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        HashMap<String, Integer> map = new HashMap<>();
        map.put("odd", 0);
        map.put("even", 0);

        for (int i = 0; i < repeatNum; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num % 2 == 0) map.put("even", map.get("even") + 1);
            else map.put("odd", map.get("odd") + 1);
        }

        if (map.get("even") > map.get("odd")) {
            sb.append("Happy");
        } else {
            sb.append("Sad");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
