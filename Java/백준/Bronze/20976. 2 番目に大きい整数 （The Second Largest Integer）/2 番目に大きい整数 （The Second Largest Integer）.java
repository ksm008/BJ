import java.io.*;  
import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 총 값은 3개, 정렬을 하기만 하면 중간 값이 곧 두 번째로 큰 숫자...  
  
        List<Integer> lists = new ArrayList<>();  
        String[] str = br.readLine().split(" ");  
  
        for (int i = 0; i < 3; i++) {  
            lists.add(Integer.parseInt(str[i]));  
        }  
        Collections.sort(lists);  
  
        bw.write(lists.get(1) + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}