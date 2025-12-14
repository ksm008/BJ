import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        while (true) {  
            String str = br.readLine();  
            if (str.equals("end")) break;  
            else if (str.equals("animal")) {  
                sb.append("Panthera tigris\n");  
            } else if (str.equals("flower")) {  
                sb.append("Forsythia koreana\n");  
            } else {  
                sb.append("Pinus densiflora\n");  
            }  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}