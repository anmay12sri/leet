class Solution {
    public String reverseParentheses(String s) {
      StringBuilder st=new StringBuilder();
      Stack<Integer>stack=new Stack<>();

      for(char currch:s.toCharArray()){
        if(currch=='('){
            stack.push(st.length());
        }else if(currch==')'){
            int start=stack.pop();
            reverse(st,start,st.length()-1);
        }else {
            st.append(currch);
        }
      }
      return st.toString();


    }
    public void reverse(StringBuilder st,int start,int end){
        while(start<end){
            char temp=st.charAt(start);
             st.setCharAt(start,st.charAt(end));
             st.setCharAt(end,temp);
        
            start++;
            end--;
        }
    }
}