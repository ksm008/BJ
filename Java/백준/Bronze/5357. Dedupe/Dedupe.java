import java.io.*;  

  

public class Main {  

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

    static StringBuilder sb = new StringBuilder();  

  

    public static void main(String[] args) throws IOException {  

        int N = Integer.parseInt(br.readLine());  

  

        for (int i = 0; i < N; i++) {  

            String str = br.readLine();  

            int len = str.length();  

            char temp = str.charAt(0);  

            sb.append(temp);  

  

            for (int j = 1; j < len; j++) {  

                if (str.charAt(j) != temp) {  

                    sb.append(str.charAt(j));  

                    temp = str.charAt(j);  

                }  

            }  

            sb.append('\n');  

        }  

  

        bw.write(sb.toString());  

        bw.flush();  

        bw.close();  

        br.close();  

    }  

}