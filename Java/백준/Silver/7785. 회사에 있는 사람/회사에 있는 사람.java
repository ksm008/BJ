import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
  
        Map<String, String> map = new HashMap<>();  
  
        for (int i = 0; i < N; i++) {  
            StringTokenizer st = new StringTokenizer(br.readLine());  
            String name = st.nextToken();  
            String isWorking = st.nextToken();  
            if (isWorking.equals("enter")) map.put(name, isWorking);  
            else map.remove(name);  
        }  
  
        List<Map.Entry<String, String>> list = new ArrayList<>(map.entrySet());  
        list.sort(Map.Entry.comparingByKey(Comparator.reverseOrder()));  
  
        for (Map.Entry<String, String> entry : list) {  
            sb.append(entry.getKey()).append("\n");  
        }  
          
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}