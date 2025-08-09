import java.io.*;  

  

public class Main {  

    public static void main(String[] args) throws IOException {  

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));  

        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));  

  

        int num = Integer.parseInt(br.readLine());  

  

        for (int i = 0; i < num; i++) {  

            int C = Integer.parseInt(br.readLine());  

  

            int quarter = C / 25;  

            C %= 25;  

  

            int dime = C / 10;  

            C %= 10;  

  

            int nickel = C / 5;  

            C %= 5;  

  

            int penny = C;  

  

            bw.write(quarter + " " + dime + " " + nickel + " " + penny + "\n");  

        }  

  

        bw.flush();  

        bw.close();  

        br.close();  

    }  

}