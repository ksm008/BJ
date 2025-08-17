import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        int num = Integer.parseInt(br.readLine());  
        int[] stairs = new int[num + 1];  
        for (int i = 1; i <= num; i++) {  
            stairs[i] = Integer.parseInt(br.readLine());  
        }  
  
        if (num == 1) {  
            bw.write(stairs[1] + "");  
        } else if (num == 2) {  
            bw.write((stairs[1] + stairs[2]) + "");  
        } else {  
            int[] result = new int[num + 1];  
            result[1] = stairs[1];  
            result[2] = stairs[1] + stairs[2];  
            result[3] = Math.max(stairs[1] + stairs[3], stairs[2] + stairs[3]);  
  
            for (int i = 4; i <= num; i++) {  
                result[i] = Math.max(result[i - 2], result[i - 3] + stairs[i - 1]) + stairs[i];  
            }  
  
            bw.write(result[num] + "");  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}