import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // j나 i일때만 2를 더하고 아니면 1 더하기...  
        int num = Integer.parseInt(br.readLine());  
        int result = 0;  
        String str = br.readLine();  
  
        for (char c : str.toCharArray()) {  
            if (c == 'j' || c == 'i') {  
                result+=2;  
            } else {  
                result++;  
            }  
        }  
  
        bw.write(result + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}