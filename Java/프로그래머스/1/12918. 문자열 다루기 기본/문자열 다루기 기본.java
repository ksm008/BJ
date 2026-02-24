class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        
        if (len != 4 && len != 6) {
            answer = false;
        } else {
            for (char ch : s.toCharArray()) {
                if (ch < '0' || ch > '9') {
                    answer = false;
                    break;
                }
            }
        }
        
     
    
        return answer;
    }
}