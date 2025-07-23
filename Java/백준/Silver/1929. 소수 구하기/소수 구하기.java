import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        String[] str = br.readLine().split(" ");  
        int M = Integer.parseInt(str[0]);  
        int N = Integer.parseInt(str[1]);  
  
        boolean[] isPrime = new boolean[N + 1];  
  
        // 초기화: 일단 모두 true로 두고, 0과 1은 소수가 아님  
        for (int i = 2; i <= N; i++) {  
            isPrime[i] = true;  
        }  
  
        // 에라토스테네스의 체 시작  
        for (int i = 2; i * i <= N; i++) {  
            if (isPrime[i]) {  
                for (int j = i * i; j <= N; j += i) {  
                    isPrime[j] = false;  
                }  
            }  
        }  
  
        // M 이상 N 이하 출력  
        for (int i = M; i <= N; i++) {  
            if (isPrime[i]) {  
                bw.write(i + "\n");  
            }  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}