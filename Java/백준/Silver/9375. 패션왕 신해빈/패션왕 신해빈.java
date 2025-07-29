import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            int num = Integer.parseInt(br.readLine());

            Map<String, Integer> map = new HashMap<>();

            for (int j = 0; j < num; j++) {
                String[] str = br.readLine().split(" ");
                String type = str[1];

                map.put(type, map.getOrDefault(type ,0) + 1);
            }

            int result = 1;

            for (int count : map.values()) {
                result *= (count + 1);
            }

            result -= 1;
            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}