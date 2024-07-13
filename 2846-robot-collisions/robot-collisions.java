class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
       int n=positions.length;
        List<Integer>ind=new ArrayList<>();
        for(int i=0;i<n;i++){
            ind.add(i);
        }
       ind.sort((a,b)->Integer.compare(positions[a],positions[b]));

       Stack<Integer>st=new Stack<>();

       for(int i:ind){
        if(directions.charAt(i)=='R'){
            st.push(i);
            continue;
        }
        while(!st.isEmpty() && healths[i]>0){
             if(healths[st.peek()]<healths[i]){
                healths[st.pop()]=0;
                healths[i]-=1;
             }else if(healths[i]<healths[st.peek()]){
                healths[st.peek()]-=1;
                healths[i]=0;
             }else{
                healths[st.pop()]=0;
                healths[i]=0;
             }
        }
       }
       List<Integer>lis=new ArrayList<>();
       for(int x:healths){
        if(x>0){
            lis.add(x);
        }
       }
        return lis;

    }
}