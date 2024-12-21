import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        String[] rickRoll = new String[] {
                "Never gonna give you up",
                "Never gonna let you down",
                "Never gonna run around and desert you",
                "Never gonna make you cry",
                "Never gonna say goodbye",
                "Never gonna tell a lie and hurt you",
                "Never gonna stop"
        };

        int temp = 0;
        boolean isRick = true;

        while (temp < num) {
            String str = br.readLine();
            boolean found = false;

            for (String lyric : rickRoll) {
                if (str.equals(lyric)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                isRick = false;
            }

            temp++;
        }

        if (isRick) {
            bw.write("No");
        } else {
            bw.write("Yes");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}