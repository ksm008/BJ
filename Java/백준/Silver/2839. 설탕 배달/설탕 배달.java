import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int result = 0;

        while (true) {
            // 5키로 봉지를 최대한 많이 써야하니까 만약 설탕 무게가 5로 나누어 떨어지면 바로 나눈 값을 출력...
            if (num % 5 == 0) {
                result += num / 5;
                break;
            }
            // 만약 나누어 떨어지지 않는다면 될 때까지 3을 빼면서 봉지수를 1씩 늘려감...
            num -= 3;
            // 이때 3을 빼면서 설탕 무게가 0보다 낮아지면 -1을 출력..
            if (num < 0) {
                result = -1;
                break;
            }
            result++;

        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
}