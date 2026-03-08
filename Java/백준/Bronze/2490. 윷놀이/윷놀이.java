import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        for (int i = 0; i < 3; i++) {  
            String[] str = br.readLine().split(" ");  
            sb.append(yeet(str)).append("\n");  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
  
    static char yeet(String[] str) {  
        int zeroCnt = 0;  
  
        for (int i = 0; i < 4; i++) {  
            if (str[i].charAt(0) == '0') {  
                zeroCnt++;  
            }  
        }  
  
        switch (zeroCnt) {  
            case 1:  
                return 'A';  
            case 2:  
                return 'B';  
            case 3:  
                return 'C';  
            case 4:  
                return 'D';  
            case 0:  
                return 'E';  
        }  
  
        return 'F';  
    }  
}