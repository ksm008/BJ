import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        String[] str = br.readLine().split(" ");  
  
        int num = Integer.parseInt(str[0]);  
        int price = Integer.parseInt(str[1]);  
  
        int coinCnt = 0;  
  
        int[] coins = new int[num];  
  
        for (int i = 0; i < num; i++) {  
            coins[i] = Integer.parseInt(br.readLine());  
        }  
  
        for (int i = num - 1; i >= 0; i--) {  
            if (coins[i] <= price) {  
                coinCnt += price / coins[i];  
                price %= coins[i];  
            }  
        }  
  
        bw.write(coinCnt + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}