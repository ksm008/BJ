import java.io.*;  
import java.util.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // list.contains()를 쓰면 시간 초과. 시간 복잡도는 O(n)이므로  
        // 최악의 경우일때 100,000 * 100,000 = 10억번 수행.  
        // 대신 해시맵을 써서 O(1)로 줄이기.  
  
        int num = Integer.parseInt(br.readLine());  
        String[] str = br.readLine().split(" ");  
        Map<Integer, Integer> map = new HashMap<>();  
  
        for (int i = 0; i < num; i++) {  
            int v = Integer.parseInt(str[i]);  
            map.put(v, map.getOrDefault(v, 0) + 1);  
        }  
  
        num = Integer.parseInt(br.readLine());  
        str = br.readLine().split(" ");  
  
        for (int i = 0; i < num; i++) {  
            int v = Integer.parseInt(str[i]);  
            int cnt = map.getOrDefault(v, 0);  
            bw.write(cnt + (i == num - 1 ? "" : " "));  
        }  
  
        bw.flush();  
        br.close();  
        bw.close();  
    }  
}