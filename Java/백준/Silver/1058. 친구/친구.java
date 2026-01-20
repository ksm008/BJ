import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        int N = Integer.parseInt(br.readLine());  
          
        char[][] people = new char[N + 1][N + 1];  
        int[] twoFriends = new int[N + 1];  
  
        for (int i = 1; i <= N; i++) {  
            String str = br.readLine();  
            for (int j = 1; j <= N; j++) {  
                people[i][j] = str.charAt(j - 1);  
            }  
        }  
  
        for (int i = 1; i <= N; i++) {  
            int cnt = 0;  
            for (int j = 1; j <= N; j++) {  
                if (i == j) continue;  
                if (people[i][j] == 'Y') {  
                    cnt++;  
                } else {  
                    for (int k = 1; k <= N; k++) {  
                        if (people[k][i] == 'Y' && people[k][j] == 'Y') {  
                            cnt++;  
                            break;  
                        }  
                    }  
                }  
            }  
            twoFriends[i] = cnt;  
        }  
  
        int result = Integer.MIN_VALUE;  
  
        for (int num : twoFriends) {  
            result = Math.max(result, num);  
        }  
  
        sb.append(result);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}