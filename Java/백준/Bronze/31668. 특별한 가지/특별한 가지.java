import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        int rowAmount = Integer.parseInt(br.readLine());  
        int total = Integer.parseInt(br.readLine());  
        int eggplant = Integer.parseInt(br.readLine());  
          
        // 총 몇 줄의 파묻튀밥을 만들었는지 구하고, 한 줄당 필요한 가지의 양을 곱하면 끝.  
  
        int result = total / rowAmount * eggplant;  
        bw.write(result + "");  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}