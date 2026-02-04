import java.io.*;  
import java.util.Arrays;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        String str = br.readLine();  
  
        int numberSum = 0;  
        boolean zeroFlag = false;  
  
        for (int i = 0; i < str.length(); i++) {  
            int curr = str.charAt(i) - '0';  
            if (curr == 0) {  
                zeroFlag = true;  
            }  
            numberSum += curr;  
        }  
  
        if (!(numberSum % 3 == 0) || !zeroFlag) {  
            sb.append(-1);  
        } else {  
            char[] strArray = str.toCharArray();  
            Arrays.sort(strArray);  
  
            for (int i = strArray.length - 1; i >= 0; i--) {  
                sb.append(strArray[i]);  
            }  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}