import java.io.*;  

  

public class Main {  

    public static void main(String[] args) throws IOException {  

        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));  

        BufferedWriter  bw = new BufferedWriter(new OutputStreamWriter(System.out));  

  

        int num = Integer.parseInt(br.readLine());  

  

        for (int t = 0; t < num; t++) {  

            int n = Integer.parseInt(br.readLine());  

            long result = 0;  

  

            for (int j = 1; j <= n; j++) {  

                long term = (long) j * (j + 1) * (j + 2) / 2;  

                result += term;  

            }  

  

            bw.write(result + "\n");  

        }  

  

        bw.flush();  

        bw.close();  

        br.close();  

    }  

}