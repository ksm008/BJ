import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int AXB = A * B;
        /* 유클리드 호제법
        최대 공약수는 두 수 A,B에 대하여 A % B의 결과가 0인지 아닌지 확인한다. 만약 0이라면, B가 최대 공약수이다.
        0이 아니라면 B의 값을 A로, 나머지 결과값 R을 B로 바꿔 다시 나머지 계산을 한다. 0이 나올때까지 반복한다.

        최소 공배수는 최대 공약수를 사용해 구할 수 있다.
        (A * B) / 최대 공약수 */
        while (B != 0) {
            int remain = A % B;
            A = B;
            B = remain;
        }

        int GCD = A;
        int LCM = AXB / GCD;

        bw.write(GCD + " " + LCM);
        bw.flush();
        bw.close();
        br.close();
    }
}