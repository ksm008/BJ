import java.io.*;  
import java.util.Stack;  
  
public class Main {  
    public static void main(String[] args) throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
  
        // 0. 반복문이 2개가 중첩되어 있을 때 내부 반복문을 빠져나가면서  
        //    아래에 있는 명령어들을 스킵하고 싶다면, 외부 반복문에 레이블을 추가하고  
        //    내부 반복문 continue 뒤에 레이블을 써주면 된다.  
        // 1. 만약 점 하나만 들어오면 바로 no        
        // 2. 정규식을 통해 알파벳, 소괄호, 대괄호, 공백만 있는지 확인하고  
        //    문장 맨 끝은 무조건 .이라고 입력이 있긴 하지만 마지막이 .으로 끝나는지 체크하도록 했다.  
        // 3. 정규식도 만족했다면 괄호들이 서로 짝이 맞게 이루어져있는지 스택으로 확인  
  
        outer:  
        while (true) {  
            String str = br.readLine();  
            if (str.equals(".")) break;  
  
            Stack<Character> st = new Stack<>();  
  
            if (str.matches("^[A-Za-z()\\[\\] ]+\\.$")) {  
                for (int i = 0; i < str.length() - 1; i++) {  
                    char c = str.charAt(i);  
                    if (c == '(' || c == '[') {  
                        st.push(c);  
                    } else if (c == ')') {  
                        if (st.isEmpty() || st.pop() != '(') {  
                            bw.write("no\n");  
                            continue outer;  
                        }  
                    } else if (c == ']') {  
                        if (st.isEmpty() || st.pop() != '[') {  
                            bw.write("no\n");  
                            continue outer;  
                        }  
                    }  
                }  
            } else {  
                bw.write("no\n");  
                continue;  
            }  
  
            if (st.isEmpty())  
                bw.write("yes\n");  
            else  
                bw.write("no\n");  
        }  
  
        bw.flush();  
        bw.close();  
        br.close();  
    }  
}