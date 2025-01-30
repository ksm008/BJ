import java.io.*;  

public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        
        int num = Integer.parseInt(br.readLine());  
        int dCnt = 0;  
        int pCnt = 0;  
        boolean gameSet = false;  
        
        for (int i = 0; i < num; i++) {  
            String str = br.readLine();  
            if (str.equals("D") && !gameSet) {  
                dCnt++;  
            } else if (str.equals("P") && !gameSet) {  
                pCnt++;  
            }  
            if (dCnt - pCnt == 2 || pCnt - dCnt == 2) {  
                gameSet = true;  
            }  
        }  
        bw.write(dCnt + ":" + pCnt);  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}