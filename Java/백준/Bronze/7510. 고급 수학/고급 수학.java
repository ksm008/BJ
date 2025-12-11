import java.io.*;  
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
        StringTokenizer st;  
  
        for (int i = 1; i <= N; i++) {  
            st = new StringTokenizer(br.readLine());  
            ArrayList<Integer> list = new ArrayList<>();  
  
            list.add(Integer.parseInt(st.nextToken()));  
            list.add(Integer.parseInt(st.nextToken()));  
            list.add(Integer.parseInt(st.nextToken()));  
  
            Collections.sort(list);  
  
            sb.append("Scenario #").append(i).append(":\n");  
  
            if (list.get(2) * list.get(2) == list.get(1) * list.get(1) + list.get(0) * list.get(0)) {  
                sb.append("yes\n");  
            } else {  
                sb.append("no\n");  
            }  
            sb.append('\n');  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}