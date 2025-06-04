import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        String str = br.readLine();  
  
        int count = 0;  
        int countY = 0;  
  
        for (char c : str.toCharArray()) {  
            if ("aeiou".indexOf(c) != -1) {  
                count++;  
                countY++;  
            } else if (c == 'y') {  
                countY++;  
            }  
        }  
  
        bw.write(count + " " + countY);  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}