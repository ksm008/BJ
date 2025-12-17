import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        String str = br.readLine();  
  
        switch (str.charAt(0)) {  
            case 'F':  
                sb.append("Foundation");  
                break;  
            case 'C':  
                sb.append("Claves");  
                break;  
            case 'V':  
                sb.append("Veritas");  
                break;  
            default:  
                sb.append("Exploration");  
                break;  
        }  
  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}