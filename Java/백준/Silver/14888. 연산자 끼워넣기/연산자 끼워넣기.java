import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int N, max, min;  
    static int[] numbers, operators;  
  
    public static void main(String[] args) throws IOException {  
        N = Integer.parseInt(br.readLine());  
        numbers = new int[N];  
  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        for (int i = 0; i < N; i++) {  
            numbers[i] = Integer.parseInt(st.nextToken());  
        }  
  
        st = new StringTokenizer(br.readLine());  
        operators = new int[4];  
  
        for (int i = 0; i < 4; i++) {  
            operators[i] = Integer.parseInt(st.nextToken());  
        }  
  
        max = Integer.MIN_VALUE;  
        min = Integer.MAX_VALUE;  
  
        solve(numbers[0], 1, operators[0], operators[1], operators[2], operators[3]);  
  
        sb.append(max).append('\n').append(min);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static void solve(int currentValue, int depth, int plus, int minus, int multiply, int divide) {  
        if (depth == N) {  
            max = Math.max(max, currentValue);  
            min = Math.min(min, currentValue);  
        }  
  
        if (plus > 0) {  
            solve(currentValue + numbers[depth],depth + 1, plus - 1, minus, multiply, divide);  
        }  
        if (minus > 0) {  
            solve(currentValue - numbers[depth],depth + 1, plus, minus - 1, multiply, divide);  
        }  
        if (multiply > 0) {  
            solve(currentValue * numbers[depth], depth + 1, plus, minus, multiply - 1, divide);  
        }  
        if (divide > 0) {  
            solve(currentValue / numbers[depth],depth + 1, plus, minus, multiply, divide - 1);  
        }  
    }  
}