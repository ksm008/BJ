import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        String str = br.readLine().replaceAll("6", "9");  
  
        int[] cnt = new int[10];  
        int result = 0;  
  
        for (int i = 0; i < str.length(); i++) {  
            int num = str.charAt(i) - '0';  
            cnt[num]++;  
        }  
  
        for (int i = 0; i < cnt.length; i++) {  
            if (i == 9) {  
                if (cnt[i] % 2 != 0) {  
                    cnt[i] = cnt[i] / 2 + 1;  
                } else cnt[i] = cnt[i] / 2;  
            }  
  
            if (cnt[i] > result) result = cnt[i];  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}