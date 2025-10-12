import java.io.*;  
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        String str = br.readLine();  
        int len = str.length();  
        List<String> list = new ArrayList<>();  
  
        for (int i = 1; i < len - 1; i++) {  
            for (int j = i + 1; j < len; j++) {  
                String part1 = str.substring(0, i);  
                String part2 = str.substring(i, j);  
                String part3 = str.substring(j, len);  
  
                part1 = new StringBuilder(part1).reverse().toString();  
                part2 = new StringBuilder(part2).reverse().toString();  
                part3 = new StringBuilder(part3).reverse().toString();  
  
                String newString = part1.concat(part2).concat(part3);  
                list.add(newString);  
            }  
        }  
  
        Collections.sort(list);  
        bw.write(list.get(0));  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}