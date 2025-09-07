import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
    public static void main(String[] args) throws IOException {  
        int num = Integer.parseInt(br.readLine());  
        int[] result = new int[num + 1];  
  
        result[1] = 0;  
  
        for (int i = 2; i <= num; i++) {  
            result[i] = result[i - 1] + 1;  
            if (i % 2 == 0) {  
                result[i] = Math.min(result[i], result[i / 2] + 1);  
            }  
            if (i % 3 == 0) {  
                result[i] = Math.min(result[i], result[i / 3] + 1);  
            }  
        }  
  
        bw.write(result[num] + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}