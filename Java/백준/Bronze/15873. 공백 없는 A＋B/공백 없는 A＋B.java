import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
    public static void main(String[] args) throws IOException {  
        String str = br.readLine();  
        int a, b, result = 0;  
  
        if (str.length() == 3) {  
            if (str.charAt(0) == '1') {  
                a = Integer.parseInt(str.substring(0, str.length() - 1));  
                b = Integer.parseInt(str.charAt(2) + "");  
                result = a + b;  
            } else {  
                a = Integer.parseInt(str.charAt(0) + "");  
                b = Integer.parseInt(str.substring(1));  
                result = a + b;  
            }  
        } else if (str.length() == 2) {  
            a = Integer.parseInt(str.charAt(0) + "");  
            b = Integer.parseInt(str.charAt(1) + "");  
            result = a + b;  
        } else {  
            result = 20; // 길이가 4일때는 1010밖에 없다.  
        }  
  
        bw.write(result + "");  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}