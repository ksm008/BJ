import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int physics = Integer.parseInt(br.readLine());
        int chemistry = Integer.parseInt(br.readLine());
        int biology = Integer.parseInt(br.readLine());
        int earthScience = Integer.parseInt(br.readLine());
        int history = Integer.parseInt(br.readLine());
        int geography = Integer.parseInt(br.readLine());

        int sum = physics + chemistry + biology + earthScience + history + geography;

        int first = Math.min(Math.min(physics, chemistry), Math.min(biology, earthScience));
        int second = Math.min(history, geography);

        sum = sum - first - second;

        sb.append(sum);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
