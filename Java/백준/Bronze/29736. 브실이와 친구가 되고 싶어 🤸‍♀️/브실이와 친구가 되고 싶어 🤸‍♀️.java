import java.io.*;  

import java.util.StringTokenizer;  

  

public class Main {  

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

    static StringBuilder sb = new StringBuilder();  

  

    public static void main(String[] args) throws IOException {  

        StringTokenizer st = new StringTokenizer(br.readLine());  

  

        int A = Integer.parseInt(st.nextToken());  

        int B = Integer.parseInt(st.nextToken());  

  

        st = new StringTokenizer(br.readLine());  

  

        int K = Integer.parseInt(st.nextToken());  

        int X = Integer.parseInt(st.nextToken());  

  

        int start = Math.max(A,(K - X));  

        int end = Math.min(B,(K + X));  

  

        if (start <= end) sb.append(end - start + 1);  

        else sb.append("IMPOSSIBLE");  

  

        bw.write(sb.toString());  

        bw.flush();  

        bw.close();  

        br.close();  

    }  

}