import java.io.*;  
import java.util.Arrays;  
import java.util.Collection;  
import java.util.Collections;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        String str = br.readLine();  
        String[] arr = new String[str.length()];  
  
        for (int i = 0; i < str.length(); i++) {  
            arr[i] = String.valueOf(str.charAt(i));  
        }  
  
        Arrays.sort(arr, Collections.reverseOrder());  
  
        for (String s : arr) {  
            bw.write(s + "");  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}