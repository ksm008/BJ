import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받은 문자열의 알파벳을 전부 소문자로 바꾸고 체크를 진행함.

        while (true) {
            String str = br.readLine();
            if (str.equals("#")) break;
            int cnt = 0;

            for (int i = 0; i < str.length(); i++) {
                char c = Character.toLowerCase(str.charAt(i));
                switch (c) {
                    case 'a' : cnt++; break;
                    case 'e' : cnt++; break;
                    case 'i' : cnt++; break;
                    case 'o' : cnt++; break;
                    case 'u' : cnt++; break;
                }
            }
            bw.write(cnt + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}