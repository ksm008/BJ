import java.io.*;  
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        List<Integer> list = new ArrayList<>();  
        for (int i = 0; i < 7; i++) {  
            int num = Integer.parseInt(br.readLine());  
            if (num % 2 != 0) {  
                list.add(num);  
            }  
        }  
  
        if (list.isEmpty()) {  
            sb.append(-1);  
        } else {  
            int result = 0;  
            for (int i : list) {  
                result += i;  
            }  
            Collections.sort(list);  
            sb.append(result).append("\n");  
            sb.append(list.get(0));  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}