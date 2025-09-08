import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        String str = br.readLine();  
        int len = str.length();  
  
        if (len < 10) {  
            bw.write(str + "");  
        } else {  
            for (int i = 1; i <= len; i++) {  
                if (i % 10 == 0) {  
                    sb.append(str.charAt(i - 1));  
                    sb.append("\n");  
                } else {  
                    sb.append(str.charAt(i - 1));  
                }  
            }  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}