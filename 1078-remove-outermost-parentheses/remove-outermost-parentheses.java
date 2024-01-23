class Solution {
    public String removeOuterParentheses(String s) {
      int count=0;
      StringBuilder st=new StringBuilder();
       for(char c:s.toCharArray()){
           if(c=='('){
               if(count>0){
                   st.append(c);
               }
               count++;
           }else if(c==')'){
               count--;
               if(count>0){
                   st.append(c);
               }
           }
       }
     
         
      
      return st.toString();
    }
}