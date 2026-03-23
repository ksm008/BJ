import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        String[] str1 = br.readLine().split(" ");  
        String[] str2 = br.readLine().split(" ");  
  
        int num1 = Integer.parseInt(str1[0]) * 3 + Integer.parseInt(str1[1]) * 20 + Integer.parseInt(str1[2]) * 120;  
        int num2 = Integer.parseInt(str2[0]) * 3 + Integer.parseInt(str2[1]) * 20 + Integer.parseInt(str2[2]) * 120;  
  
        if (num1 > num2) bw.write("Max");  
        else if (num1 == num2) bw.write("Draw");  
        else if (num1 < num2) bw.write("Mel");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}