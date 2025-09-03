import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 문자가 다르면 +1 하기  
  
        int num = Integer.parseInt(br.readLine());  
        String str1 = br.readLine();  
        String str2 = br.readLine();  
  
        int result = 0;  
        for (int i = 0; i < num; i++) {  
            if (str1.charAt(i) != str2.charAt(i)) {  
                result++;  
            }  
        }  
  
        bw.write(result + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}