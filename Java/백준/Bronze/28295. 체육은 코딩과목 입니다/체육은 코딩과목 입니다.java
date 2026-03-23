import java.io.*;  

  

public class Main {  

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  

    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

    static StringBuilder sb = new StringBuilder();  

  

    public static void main(String[] args) throws IOException {  

        int result = 0;  

        // 0은 북, 1은 동, 2는 남, 3은 서로 정함.  

  

        for (int i = 0; i < 10; i++) {  

            int T = Integer.parseInt(br.readLine());  

            if (T == 1) {  

                result++;  

            } else if (T == 2) {  

                result += 2;  

            } else {  

                result += 3;  

            }  

            if (result >= 4) {  

                result %= 4;  

            }   

        }  

  

        if (result == 0) {  

            sb.append("N");  

        } else if (result == 1) {  

            sb.append("E");  

        } else if (result == 2) {  

            sb.append("S");  

        } else {  

            sb.append("W");  

        }  

  

        bw.write(sb.toString());  

        bw.flush();  

        bw.close();  

        br.close();  

    }  

}