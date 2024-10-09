import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = new String[3];
        int result = 0;

        for (int i = 0; i < 3; i++) {
            str[i] = br.readLine();
            try {
                result = Integer.parseInt(str[i]);
                result += (3 - i);
            } catch (NumberFormatException e) {
                continue;
            }
        }

        boolean Fizz = (result % 3 == 0);
        boolean Buzz = (result % 5 == 0);

        if (Fizz && Buzz) {
            bw.write("FizzBuzz\n");
        } else if (Fizz) {
            bw.write("Fizz\n");
        } else if (Buzz) {
            bw.write("Buzz\n");
        } else {
            bw.write(result + "\n");  // 숫자 출력
        }

        bw.flush();
        bw.close();
        br.close();
    }
}