import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        String str = st.nextToken();  
        int num = Integer.parseInt(st.nextToken());  
        int result = 0;  
  
        for (int i = 0; i < str.length(); i++) {  
            int number = str.charAt(i);  
            if (number > 57) number -= 55;  
            else number -= 48;  
  
            result = num * result + number;  
  
        }  
        bw.write(result + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}