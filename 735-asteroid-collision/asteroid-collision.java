class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st=new Stack<>();
        
          
        for(int a:asteroids){
               Boolean flag=true;
            while(!st.isEmpty() && (a<0 && st.peek()>0)){
                if(Math.abs(st.peek())<Math.abs(a)){
                    st.pop();
                    continue;
                }else if(Math.abs(st.peek())==Math.abs(a)){
                    st.pop();
                }
                flag=false;
                break;
               
            }if(flag){
                st.push(a);
            }
             
        }
        int ans[]=new int[st.size()];
        for(int i=ans.length-1;i>=0;i--){
             ans[i]=st.peek();
             st.pop();
        }
        return ans;
    }
}