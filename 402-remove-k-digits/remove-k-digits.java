class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st=new Stack<>();
         for(char c:num.toCharArray()){
        while(!st.isEmpty() && k>0 && st.peek()>c){
            st.pop();
            k--;
        }
        st.push(c);
         }

        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
         
         StringBuilder s=new StringBuilder();
         while(!st.isEmpty()){
            s.append(st.pop());
         }
         s.reverse();
         int i=0;
         while(s.length()>0 && s.charAt(i)=='0'){
            s.deleteCharAt(i);
         }
         return s.length()>0?s.toString():"0";
         
    }
}