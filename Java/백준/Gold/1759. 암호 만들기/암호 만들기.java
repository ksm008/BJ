import java.io.*;  
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    static int L;  
    static int C;  
    static List<Character> charList;  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
        L = Integer.parseInt(st.nextToken());  
        C = Integer.parseInt(st.nextToken());  
  
        st = new StringTokenizer(br.readLine());  
  
        charList = new ArrayList<>();  
  
        for (int i = 0; i < C; i++) {  
            charList.add(st.nextToken().charAt(0));  
        }  
  
        Collections.sort(charList);  
        buildPassword("", 0);  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static void buildPassword(String password, int start_idx) {  
        if (password.length() == L) {  
            int vowelCnt = 0;  
            for (int i = 0; i < password.length(); i++) {  
                char ch = password.charAt(i);  
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {  
                    vowelCnt++;  
                }  
            }  
            if (vowelCnt >= 1 && password.length() - vowelCnt >= 2) sb.append(password).append("\n");  
            return;  
        }  
  
        for (int i = start_idx; i < C; i++) {  
            buildPassword(password + charList.get(i), i + 1);  
        }  
    }  
}