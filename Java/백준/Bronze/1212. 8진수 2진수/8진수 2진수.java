import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        String str = br.readLine();  
        int len = str.length();  
  
        String[] numbers = {"000", "001", "010", "011", "100", "101", "110", "111"};  
  
        for (int i = 0; i < len; i++) {  
            int num = str.charAt(i) - '0';  
  
            if (i == 0) {  
                sb.append(Integer.toBinaryString(num));  
            } else {  
                sb.append(numbers[num]);  
            }  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}