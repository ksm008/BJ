import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        ArrayList<String[]> members = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String[] str = br.readLine().split(" ");
            members.add(new String[]{str[0], str[1], String.valueOf(i+1)});
        }

        Collections.sort(members, (a, b) -> {
            int ageA = Integer.parseInt(a[0]);
            int ageB = Integer.parseInt(b[0]);

            if (ageA == ageB) {
                return Integer.compare(Integer.parseInt(a[2]), Integer.parseInt(b[2]));
            }
            return Integer.compare(ageA, ageB);
        });

        for (String[] member : members) {
            bw.write(member[0] + " " + member[1] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}