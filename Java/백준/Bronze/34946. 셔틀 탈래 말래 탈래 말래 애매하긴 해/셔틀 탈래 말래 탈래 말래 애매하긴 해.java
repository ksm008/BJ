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

        int C = Integer.parseInt(st.nextToken());  

        int D = Integer.parseInt(st.nextToken());  

  

        int shuttleTime = A + B;  

        boolean isShuttleEnough = shuttleTime <= D;  

        boolean isWalkEnough = C <= D;  

  

        if (isShuttleEnough && isWalkEnough) sb.append("~.~");  

        else if (!isShuttleEnough && !isWalkEnough) sb.append("T.T");  

        else if (isShuttleEnough) sb.append("Shuttle");  

        else sb.append("Walk");  

  

        bw.write(sb.toString());  

        bw.flush();  

        bw.close();  

        br.close();  

    }  

}