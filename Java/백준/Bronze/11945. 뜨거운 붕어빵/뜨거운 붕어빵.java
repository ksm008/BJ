import java.io.*;  

import java.util.StringTokenizer;  

  

public class Main {  

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

    static StringBuilder sb = new StringBuilder();  

  

    public static void main(String[] args) throws IOException {  

        StringTokenizer st = new StringTokenizer(br.readLine());  

  

        int N = Integer.parseInt(st.nextToken());  

        int M = Integer.parseInt(st.nextToken());  

  

        for (int i = 0; i < N; i++) {  

            String str = br.readLine();  

            for (int j = M - 1; j >= 0; j--) sb.append(str.charAt(j));  

            sb.append('\n');  

        }  

  

        bw.write(sb.toString());  

        bw.flush();  

        bw.close();  

        br.close();  

    }  

}