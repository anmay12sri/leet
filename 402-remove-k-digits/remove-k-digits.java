class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();

         for(char c:num.toCharArray()){
            while(!st.empty() && k>0 && st.peek()>c){
                st.pop();
                k--;
            }
            st.push(c);
         }
         while(!st.empty() && k>0){
             st.pop();
             k--;
         }
         StringBuilder sb=new StringBuilder();
         while(!st.empty()){
             sb.append(st.pop());
         }
         sb.reverse();
         int i=0;
         while(sb.length()>0 && sb.charAt(i)=='0'){
             sb.deleteCharAt(i);
         }
         return sb.length()>0?sb.toString(): "0";
    }
}