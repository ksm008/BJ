import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
    public static void main(String[] args) throws IOException {  
        String str = br.readLine();  
        int length = str.length();  
        int[] dp = new int[length + 1];  
        int result = 0;  
  
        dp[0] = 1;  
  
        if (str.charAt(0) != '0') {  
            dp[1] = 1;  
  
            for (int i = 1; i < length; i++) {  
                int dpIdx = i + 1;  
  
                int current = str.charAt(i) - '0';  
                int prev = str.charAt(i - 1) - '0';  
  
                int twoDigits = prev * 10 + current;  
  
                boolean isTwoDigitValid = (twoDigits >= 10 && twoDigits <= 26);  
                boolean isOneDigitValid = (current > 0);  
  
                if (isTwoDigitValid && isOneDigitValid) {  
                    dp[dpIdx] = (dp[i] + dp[i - 1]) % 1000000;  
                } else if (isOneDigitValid) {  
                    dp[dpIdx] = dp[i] % 1000000;  
                } else if (isTwoDigitValid) {  
                    dp[dpIdx] = dp[i - 1] % 1000000;  
                } else {  
                    break;  
                }  
            }  
            result = dp[length];  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}