import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 새로운 암호 문자열을 만들고 인덱스로 출력하기

        ArrayList<Character> alphabets = new ArrayList<>();
        ArrayList<Character> crypted = new ArrayList<>();

        for (char c = 'A'; c <= 'Z'; c++) {
            alphabets.add(c);
        }

        String str = br.readLine();

        for (char c : str.toCharArray()) {
            if (!crypted.contains(c)) {
                crypted.add(c);
            }
        }

        for (char c : alphabets) {
            if (!crypted.contains(c)) {
                crypted.add(c);
            }
        }

        str = br.readLine();

        for (char c : str.toCharArray()) {
            bw.write(crypted.get(alphabets.indexOf(c)));
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
