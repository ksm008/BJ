import java.io.*;  
import java.util.StringTokenizer;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        StringTokenizer st = new StringTokenizer(br.readLine());  
  
        int startYear = Integer.parseInt(st.nextToken());  
        int startMonth = Integer.parseInt(st.nextToken());  
        int startDay = Integer.parseInt(st.nextToken());  
  
        st = new StringTokenizer(br.readLine());  
  
        int endYear = Integer.parseInt(st.nextToken());  
        int endMonth = Integer.parseInt(st.nextToken());  
        int endDay = Integer.parseInt(st.nextToken());  
          
        int yearAge = endYear - startYear;  
        int defaultAge = (endMonth < startMonth || (endMonth == startMonth && endDay < startDay)) ? yearAge - 1 : yearAge;  
        int koreanAge = yearAge + 1;  
  
        sb.append(defaultAge).append("\n").append(koreanAge).append("\n").append(yearAge);  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}