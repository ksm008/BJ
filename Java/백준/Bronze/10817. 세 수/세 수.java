import java.io.*;  
import java.util.Arrays;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        int[] lists = new int[3];  
        String[] str = br.readLine().split(" ");  
        for (int i = 0; i < 3; i++) {  
            lists[i] = Integer.parseInt(str[i]);  
        }  
  
        Arrays.sort(lists);  
  
        bw.write(lists[1] + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}