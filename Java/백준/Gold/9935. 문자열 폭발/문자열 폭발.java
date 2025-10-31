import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        String str = br.readLine();
        String explosiveStr = br.readLine();
        int explosiveLen = explosiveStr.length();

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            // 만약 현재의 인덱스가 폭발 문자열의 길이보다 낮을 경우 검사하지 않음
            if (sb.length() >= explosiveLen) {
                boolean isSame = true;
                for (int j = 0; j < explosiveLen; j++) {
                    if (sb.charAt(sb.length() - 1 - j) != explosiveStr.charAt(explosiveLen - 1 - j)) {
                        isSame = false;
                        break;
                    }
                }
                if (isSame) {
                    sb.delete(sb.length() - explosiveLen, sb.length());
                }
            }
        }

        if (sb.length() == 0) {
            sb.append("FRULA");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
