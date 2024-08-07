class Solution {
    public int scoreOfParentheses(String s) {
        int count=0;
        Stack<Integer>st=new Stack<>();

        for(char c:s.toCharArray()){
            if(c=='('){
                st.push(0);
            }else{
                int val=0;
                while(st.peek()!=0)val+=st.pop();
                val=Math.max(2*val,1);
                st.pop();
                st.push(val);
            }
        }
        while(!st.isEmpty()){
            count+=st.pop();
        }
        return count;
    }
}