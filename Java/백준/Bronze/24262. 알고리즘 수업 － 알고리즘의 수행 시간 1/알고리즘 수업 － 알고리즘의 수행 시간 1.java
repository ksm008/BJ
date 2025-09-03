import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 함정 문제. 어떤 n이 주어지더라도 무조건 한번만 실행되고,  
        // 시간 복잡도는 O(1)이므로 다항식 최고차항 차수는 무조건 0이다.  
  
        int num = Integer.parseInt(br.readLine());  
  
        bw.write("1\n0");  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}