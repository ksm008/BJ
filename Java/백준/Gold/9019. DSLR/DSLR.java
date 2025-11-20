import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            String resultOperation = solve(A, B);
            sb.append(resultOperation).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static class Register {
        int num;
        String operation;

        public Register(int num, String operation) {
            this.num = num;
            this.operation = operation;
        }
    }

    static String solve(int A, int B) {
        boolean[] visited = new boolean[10000];
        String operation = "";
        Queue<Register> q = new LinkedList<>();
        q.offer(new Register(A, operation));

        outer:
        while (true) {
            Register current = q.poll();

            int temp = current.num;
            String tempOperation = current.operation;
            for (int i = 0; i < 4; i++) {
                int newNum = 0;
                String newOperation = "";
                switch (i) {
                    case 0:
                        newNum = doubleNum(temp);
                        newOperation = tempOperation + "D";
                        break;
                    case 1:
                        newNum = minus(temp);
                        newOperation = tempOperation + "S";
                        break;
                    case 2:
                        newNum = leftShift(temp);
                        newOperation = tempOperation + "L";
                        break;
                    case 3:
                        newNum = rightShift(temp);
                        newOperation = tempOperation + "R";
                        break;
                }
                if (visited[newNum]) {
                    continue;
                } else {
                    visited[newNum] = true;
                }

                if (newNum == B) {
                    operation = newOperation;
                    break outer;
                } else {
                    q.offer(new Register(newNum, newOperation));
                }
            }
        }

        return operation;
    }

    static int doubleNum(int num) {
        return (2 * num) % 10000;
    }

    static int minus(int num) {
        int result;

        if (num == 0) {
            result = 9999;
        } else {
            result = num - 1;
        }

        return result;
    }

    static int leftShift(int num) {
        return (num % 1000) * 10 + (num / 1000);
    }

    static int rightShift(int num) {
        return (num % 10) * 1000 + num / 10;
    }
}