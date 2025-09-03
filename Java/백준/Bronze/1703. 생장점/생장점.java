import java.io.*;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 0이 들어올 때까지 무한히 받고 for문 루프횟수는 읽어온 숫자로, 인덱스는 따로 2씩 커지게 설정  
  
        while (true) {  
            String[] str = br.readLine().split(" ");  
  
            if (str[0].equals("0")) {  
                break;  
            }  
  
            int treeAge = Integer.parseInt(str[0]);  
            int branches = 1, idx = 1;  
  
            for (int i = 0; i < treeAge; i++) {  
                branches *= Integer.parseInt(str[idx]);  
                branches -= Integer.parseInt(str[idx+1]);  
                idx += 2;  
            }  
  
            bw.write(branches + "\n");  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}