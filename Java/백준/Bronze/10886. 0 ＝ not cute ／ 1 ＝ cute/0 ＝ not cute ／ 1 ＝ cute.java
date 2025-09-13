import java.io.*;  
import java.util.HashMap;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int num = Integer.parseInt(br.readLine());  
        HashMap<Integer, Integer> map = new HashMap<>();  
        map.put(0, 0);  
        map.put(1, 0);  
  
        for (int i = 0; i < num; i++) {  
            int isCute = Integer.parseInt(br.readLine());  
            if (isCute == 1) {  
                map.put(1, map.get(1) + 1);  
            } else {  
                map.put(0, map.get(0) + 1);  
            }  
        }  
  
        if (map.get(0) > map.get(1)) {  
            sb.append("Junhee is not cute!");  
        } else {  
            sb.append("Junhee is cute!");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}