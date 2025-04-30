import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // while 문으로 계속 입력 받고 switch-case로 문자 확인 후
        // Math.pow 메소드를 정수형 변환 후 값을 곱해서 더하기
        // 역슬래시는 \\ 처럼 \ 하나를 더 써줘야 인식할 수 있음

        while (true) {
            String str = br.readLine();
            int result = 0;
            if (str.equals("#")) {
                break;
            }
            int length = str.length() - 1;

            for (int i = length; i >= 0; i--) {
                int value = 0;
                switch (str.charAt(i)) {
                    case '-': value = 0; break;
                    case '\\': value = 1; break;
                    case '(': value = 2; break;
                    case '@': value = 3; break;
                    case '?': value = 4; break;
                    case '>': value = 5; break;
                    case '&': value = 6; break;
                    case '%': value = 7; break;
                    case '/': value = -1; break;
                }

                result += value * (int) Math.pow(8, length - i);
            }

            bw.write(result + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}