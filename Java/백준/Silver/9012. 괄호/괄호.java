import java.io.*;  

  

public class Main {  

    public static void main(String[] args) throws IOException {  

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  

  

        int num = Integer.parseInt(br.readLine());  

  

        for (int i = 0; i < num; i++) {  

            String str = br.readLine();  

            // 앞이 ')'로 시작하거나 길이가 홀수면 바로 NO 출력하는게 편할듯  

            if (str.charAt(0) == ')' || str.length() % 2 != 0) bw.write("NO");  

            else  

            {  

                int cnt = 0;  

  

                for (int j = 0; j < str.length(); j++) {  

                    if (str.charAt(j) == '(') cnt++;  

                    else cnt--;  

  

                    if (cnt < 0) break;  

                }  

                if (cnt == 0) bw.write("YES");  

                else bw.write("NO");  

            }  

            bw.newLine();  

        }  

  

        bw.flush();  

        bw.close();  

        br.close();  

    }  

}