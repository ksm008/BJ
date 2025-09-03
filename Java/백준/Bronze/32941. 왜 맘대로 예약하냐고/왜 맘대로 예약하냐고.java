import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 모든 조원이 참여할 수 있는지 확인하기  
  
        String[] str = br.readLine().split(" ");  
        int reserv = Integer.parseInt(str[1]);  
        int num = Integer.parseInt(br.readLine());  
        int isOK = 0;  
  
        for (int i = 0; i < num; i++) {  
            int crew = Integer.parseInt(br.readLine());  
            str = br.readLine().split(" ");  
  
            for (int j = 0; j < str.length; j++) {  
                if (Integer.parseInt(str[j]) == reserv) isOK++;  
            }  
        }  
  
        if (isOK == num) {  
            bw.write("YES");  
        } else {  
            bw.write("NO");  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}