import java.io.*;  

  

public class Main {  

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

    static StringBuilder sb = new StringBuilder();  

  

    public static void main(String[] args) throws IOException {  

  

        int N = Integer.parseInt(br.readLine());  

        int P = Integer.parseInt(br.readLine());  

  

        int result = P;  

  

        if (N >= 5) result = Math.min(result, Math.max(0, P - 500));  

        if (N >= 10) result = Math.min(result, Math.max(0, P - (int)(P * 0.1)));  

        if (N >= 15) result = Math.min(result, Math.max(0, P - 2000));  

        if (N >= 20) result = Math.min(result, Math.max(0, P - (int)(P * 0.25)));  

  

        sb.append(result);  

  

        bw.write(sb.toString());  

        bw.flush();  

        bw.close();  

        br.close();  

    }  

}