import java.io.*;  

public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

        int num = Integer.parseInt(br.readLine());  
        int result = 0;  
        int[] menu = new int[num];  

        for (int i = 0; i < num; i++) {  
            menu[i] = Integer.parseInt(br.readLine());  
        }  
        int people = Integer.parseInt(br.readLine());  
        for (int i = 0; i < people; i++) {  
            int idx = Integer.parseInt(br.readLine()) - 1;  
            result += menu[idx];  
        }  

        bw.write(result + "");  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}