import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 숫자가 같으면 같은걸로 출력, 다르면 큰 걸 출력  
  
        String[] str = br.readLine().split(" ");  
        int n1 = Integer.parseInt(str[0]), n2 = Integer.parseInt(str[1]);  
  
        if (n1 == n2) {  
            bw.write(n1 + "");  
        } else {  
            bw.write(Math.max(n1, n2) + "");  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}