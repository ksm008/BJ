import java.io.*;  
  
public class Main {  
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
    static StringBuilder sb = new StringBuilder();  
  
    public static void main(String[] args) throws IOException {  
        final double PI = Math.PI;  
        double R = Integer.parseInt(br.readLine());  
        double euclidGeometry, taxiGeometry;  
  
        euclidGeometry = R * R * PI;  
        taxiGeometry = R * R * 2;  
  
        sb.append(String.format("%.6f", euclidGeometry)).append("\n");  
        sb.append(String.format("%.6f", taxiGeometry));  
        bw.write(sb.toString());  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}