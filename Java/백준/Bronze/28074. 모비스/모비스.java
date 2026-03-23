import java.io.*;  

  

  

public class Main {  

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

    static StringBuilder sb = new StringBuilder();  

  

    public static void main(String[] args) throws IOException {  

        String str = br.readLine();  

  

        if (str.contains("M") && str.contains("O") && str.contains("B") && str.contains("I") && str.contains("S")) {  

            sb.append("YES");  

        } else sb.append("NO");  

  

        bw.write(sb.toString());  

        bw.flush();  

        bw.close();  

        br.close();  

    }  

}