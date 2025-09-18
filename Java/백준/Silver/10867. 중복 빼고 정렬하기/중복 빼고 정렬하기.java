import java.io.*;  
import java.util.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        Set<Integer> set = new TreeSet<>();  
  
        while (st.hasMoreTokens()) {  
            int num = Integer.parseInt(st.nextToken());  
            set.add(num);  
        }  
  
        List<Integer> list = new ArrayList<>(set);  
  
        for (int i = 0; i < list.size(); i++) {  
            sb.append(list.get(i)).append(" ");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}