import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        HashMap<Character, Integer> map = new HashMap<>();  
  
        for (int i = 0; i < N; i++) {  
            String str = br.readLine();  
            int len = str.length();  
  
            int start = 1;  
  
            for (int j = len - 1; j >= 0; j--) {  
                char ch = str.charAt(j);  
                map.put(ch, map.getOrDefault(ch, 0) + start);  
                start *= 10;  
            }  
        }  
  
        List<Integer> list = new ArrayList<>(map.values());  
        Collections.sort(list, Collections.reverseOrder());  
  
        int result = 0;  
        int value = 9;  
        for (int i = 0; i < list.size(); i++) {  
            result += list.get(i) * value;  
            value--;  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}