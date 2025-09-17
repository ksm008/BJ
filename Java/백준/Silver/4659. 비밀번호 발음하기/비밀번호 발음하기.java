import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        List<Character> vowels = Arrays.asList('a','e','i','o','u');  
  
        while (true) {  
            String str = br.readLine();  
            if (str.equals("end")) break;  
  
            boolean rule1 = false;  
            boolean rule2 = true;  
            boolean rule3 = true;  
  
            int vowelCnt = 0;  
            int consonantCnt = 0;  
  
            for (int i = 0; i < str.length(); i++) {  
                char currentCh = str.charAt(i);  
  
                if (i > 0) {  
                    char pastCh = str.charAt(i - 1);  
                    if (currentCh == pastCh) {  
                        if (currentCh != 'e' && currentCh != 'o') {  
                            rule3 = false;  
                            break;  
                        }  
                    }  
                }  
  
                if (vowels.contains(currentCh)) {  
                    rule1 = true;  
                    vowelCnt++;  
                    consonantCnt = 0;  
                } else {  
                    consonantCnt++;  
                    vowelCnt = 0;  
                }  
  
  
                if (vowelCnt == 3 || consonantCnt == 3) {  
                    rule2 = false;  
                    break;  
                }  
            }  
  
            if (rule1 && rule2 && rule3) {  
                sb.append("<").append(str).append("> is acceptable.\n");  
            } else {  
                sb.append("<").append(str).append("> is not acceptable.\n");  
            }  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}