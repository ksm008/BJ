import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        String document = br.readLine();  
        String searchWord = br.readLine();  
  
        int searchWordLen = searchWord.length();  
        int idx = 0;  
        int cnt = 0;  
  
        while (true) {  
            idx = document.indexOf(searchWord, idx);  
            if (idx != -1) {  
                cnt++;  
                idx += searchWordLen;  
            } else {  
                break;  
            }  
        }  
  
        sb.append(cnt);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}