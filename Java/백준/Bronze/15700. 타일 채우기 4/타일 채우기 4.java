import java.io.*;  

import java.util.StringTokenizer;  

  

public class Main {  

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

    static StringBuilder sb = new StringBuilder();  

  

    public static void main(String[] args) throws IOException {  

        StringTokenizer st = new StringTokenizer(br.readLine());  

  

        long N = Long.parseLong(st.nextToken());  

        long M = Long.parseLong(st.nextToken());  

  

        long ans = (N * M) / 2;  

  

        sb.append(ans);  

        bw.write(sb.toString());  

        bw.flush();  

        bw.close();  

        br.close();  

    }  

}