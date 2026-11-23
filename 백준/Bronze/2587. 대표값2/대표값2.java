import java.io.*;  
import java.util.Arrays;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int[] array = new int[5];  
        int sum = 0;  
  
        for (int i = 0; i < 5; i++) {  
            array[i] = Integer.parseInt(br.readLine());  
            sum += array[i];  
        }  
  
        Arrays.sort(array);  
        sb.append(sum / 5).append("\n");  
        sb.append(array[2]);  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}