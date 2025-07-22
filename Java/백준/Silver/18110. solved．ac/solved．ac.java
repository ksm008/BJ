import java.io.*;  
import java.util.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        int n = Integer.parseInt(br.readLine());  
  
        if (n == 0) {  
            bw.write("0");  
            bw.flush();  
            return;  
        }  
  
        int[] lists = new int[n];  
        for (int i = 0; i < n; i++) {  
            lists[i] = Integer.parseInt(br.readLine());  
        }  
  
        Arrays.sort(lists);  
  
        int cut = (int) Math.round(n * 0.15);  
  
        int sum = 0;  
        for (int i = cut; i < n - cut; i++) {  
            sum += lists[i];  
        }  
  
        int count = n - (cut * 2);  
        long avg = Math.round(sum / (double) count);  
  
        bw.write(avg + "");  
          
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}