import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        String[] str = br.readLine().split(" ");  
        int num = Integer.parseInt(str[0]);  
        int height = Integer.parseInt(str[1]);  
  
        str = br.readLine().split(" ");  
        int result = 0;  
        for (int i = 0; i < num; i++) {  
            if (height >= Integer.parseInt(str[i])) result++;  
        }  
  
        bw.write(result + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}