import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        
        // 변하지 않는 상수 값은 final로 정의하는 습관 들이기.  
        final int r = 31;  
        final int mod = 1234567891;  
  
        int num = Integer.parseInt(br.readLine());  
        String str = br.readLine();  
        long result = 0;  
        long pow = 1;  
  
        for (int i = 0; i < num; i++) {  
            int value = str.charAt(i) - 96;  
            result = (result + value * pow) % mod;  
            pow = (pow * r) % mod;  
        }  
  
        bw.write(result + "");  
          
        bw.flush();  
        br.close();  
        bw.close();  
    }  
}