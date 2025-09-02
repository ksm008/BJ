import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
    public static void main(String[] args) throws IOException {  
        int num = Integer.parseInt(br.readLine());  
        int[] result = new int[num + 2];  
  
        result[1] = 1;  
        result[2] = 2;  
  
        for (int i = 3; i <= num; i++) {  
            result[i] = (result[i - 1] + result[i - 2]) % 10007;  
        }  
  
        bw.write(result[num] + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}