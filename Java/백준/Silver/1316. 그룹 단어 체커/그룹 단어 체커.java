import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < num; i++) {
            String str = br.readLine();
            List<Character> charList = new ArrayList<>();
            boolean isGroup = true;

            for (int j = 0; j < str.length(); j++) {
                char currentChar = str.charAt(j);
                if (charList.contains(currentChar)) {
                    if (str.charAt(j - 1) != currentChar) {
                        isGroup = false;
                        break;
                    }
                } else {
                    charList.add(currentChar);
                }
            }
            if (isGroup) {
                cnt++;
            }
        }

        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}