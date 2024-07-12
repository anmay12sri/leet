class Solution {
    public String removeSubstr(String s,String match){
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (!st.isEmpty() && ch == match.charAt(1) && st.peek() == match.charAt(0)) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
            StringBuilder sb = new StringBuilder();
        for (char ch : st) {
            sb.append(ch);
        }
        
        return sb.toString();
        
    }
    public int maximumGain(String s, int x, int y) {
        int n=s.length();
        int score=0;
        
        String maxst = (x > y) ? "ab" : "ba";
        String minst = (x > y) ? "ba" : "ab";

        
        String temp_f = removeSubstr(s, maxst);
        int L = temp_f.length();
        int charrem = n - L;
        score += (charrem / 2) * Math.max(x, y);

         
        String temp_s = removeSubstr(temp_f, minst);
        charrem = L - temp_s.length();
        score += (charrem / 2) * Math.min(x, y);

        return score;

    }
}