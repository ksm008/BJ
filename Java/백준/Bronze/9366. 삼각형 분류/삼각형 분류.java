import java.io.*;  
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.Objects;  
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
  
            sb.append("Case #").append(i).append(": ");  
  
            if (list.get(0) + list.get(1) > list.get(2)) {  
                if (Objects.equals(list.get(0), list.get(1)) && Objects.equals(list.get(1), list.get(2))) {  
                    sb.append("equilateral");  
                } else if (Objects.equals(list.get(0), list.get(1)) || Objects.equals(list.get(1), list.get(2))) {  
                    sb.append("isosceles");  
                } else {  
                    sb.append("scalene");  
                }  
            } else {  
                sb.append("invalid!");  
            }  
            sb.append('\n');  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}