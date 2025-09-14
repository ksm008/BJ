import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int num = Integer.parseInt(br.readLine());  
        for (int i = 0; i < num; i++) {  
            int repeatNum = Integer.parseInt(br.readLine());  
            int result = 0;  
            StringTokenizer st = new StringTokenizer(br.readLine()," ");  
            for (int j = 0; j < repeatNum; j++) {  
                int numbers = Integer.parseInt(st.nextToken());  
                result += numbers;  
            }  
            bw.write(result + "\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}