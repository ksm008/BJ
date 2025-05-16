import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 문자는 기본적으로 대소문자 구분을 하기 때문에 그냥 비교하면 된다.

        String ex = "SciComLove";

        String str = br.readLine();
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ex.charAt(i)) {
                result++;
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}