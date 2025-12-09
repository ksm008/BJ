import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int[] mushrooms = new int[10];  
        mushrooms[0] = Integer.parseInt(br.readLine());  
        int result = mushrooms[0];   
  
        for (int i = 1; i < 10; i++) {  
            mushrooms[i] = mushrooms[i - 1] + Integer.parseInt(br.readLine());  
  
            int temp1 = Math.abs(100 - mushrooms[i]);  
            int temp2 = Math.abs(100 - result);  
  
            if (temp1 <= temp2 && result < mushrooms[i]) {  
                result = mushrooms[i];  
            }  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}