import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        String[] str = br.readLine().split(" ");  
        int firstApple = Integer.parseInt(str[0]);  
        int firstOrange = Integer.parseInt(str[1]);  
  
        str = br.readLine().split(" ");  
        int secondApple = Integer.parseInt(str[0]);  
        int secondOrange = Integer.parseInt(str[1]);  
  
        int firstCase = firstApple + secondOrange;  
        int secondCase = secondApple + firstOrange;  
  
        bw.write(Math.min(firstCase, secondCase) + "");  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}