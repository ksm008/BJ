import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 다이나믹 프로그래밍은 이전 결과를 저장해서 다시 쓰는 것.
        // 1, 2, 3의 결과를 미리 저장해서 다른 숫자들의 계산에 사용한다.
        // 4의 경우 3, 2, 1의 결과를 전부 합친 것과 같음.
        // 쭉 계산해보면... list[n] = list[n-1] + list[n-2] + list[n-3]과 같다.

        int repeat = Integer.parseInt(br.readLine());

        int[] resultList = new int[11];

        resultList[1] = 1;
        resultList[2] = 2;
        resultList[3] = 4;

        for (int i = 4; i <= 10; i++) {
            resultList[i] = resultList[i - 1] + resultList[i - 2] + resultList[i - 3];
        }

        for (int i = 0; i < repeat; i++) {
            int num = Integer.parseInt(br.readLine());
            bw.write(resultList[num] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}