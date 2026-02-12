import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        String str = br.readLine();  
        int[] characters = new int[26];  
  
        for (char c : str.toCharArray()) {  
            characters[c - 'A']++;  
        }  
  
        int cnt = 0;  
  
        for (int value : characters) {  
            if (value % 2 != 0) cnt++;  
            if (cnt > 1) break;  
        }  
  
        if (cnt > 1) {  
            sb.append("I'm Sorry Hansoo");  
        } else {  
            char odd = '@';  
            for (int i = 0; i < 26; i++) {  
                int value = characters[i];  
                if (value % 2 != 0) {  
                    odd = (char) (i + 'A');  
                }  
                for (int j = 0; j < value / 2; j++) {  
                    sb.append((char) (i + 'A'));  
                }  
            }  
  
            String temp = sb.toString();  
            StringBuilder tempSb = new StringBuilder();  
            tempSb.append(temp).reverse();  
            if (odd != '@') {  
                sb.append(odd);  
            }  
            sb.append(tempSb);  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}