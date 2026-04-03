import java.io.*;  
import java.util.StringTokenizer;  
import java.util.TreeMap;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        TreeMap<Integer, Integer> map = new TreeMap<>();  
  
        int T = Integer.parseInt(br.readLine());  
        for (int i = 0; i < T; i++) {  
            int K = Integer.parseInt(br.readLine());  
            for (int j = 0; j < K; j++) {  
                StringTokenizer st = new StringTokenizer(br.readLine());  
                char ch = st.nextToken().charAt(0);  
                int num = Integer.parseInt(st.nextToken());  
  
                if (ch == 'I') {  
                    map.put(num, map.getOrDefault(num, 0) + 1);  
                } else {  
                    if (!map.isEmpty()) {  
                        if (num == 1) {  
                            if (map.get(map.lastKey()) == 1) {  
                                map.remove(map.lastKey());  
                            } else {  
                                map.put(map.lastKey(), map.getOrDefault(map.lastKey(), 0) - 1);  
                            }  
                        } else {  
                            if (map.get(map.firstKey()) == 1) {  
                                map.remove(map.firstKey());  
                            } else {  
                                map.put(map.firstKey(), map.getOrDefault(map.firstKey(), 0) - 1);  
                            }  
                        }  
                    }  
                }  
            }  
            if (map.isEmpty()) {  
                sb.append("EMPTY").append('\n');  
            } else {  
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append('\n');  
            }  
  
            map.clear();  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}