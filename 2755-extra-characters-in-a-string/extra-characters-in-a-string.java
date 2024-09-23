class Solution {
    public int minExtraChar(String s, String[] dictionary) {
        int n=s.length();
        Set<String>set=new HashSet<>();
        int memo[]=new int[n];
        Arrays.fill(memo,-1);
        for(String st:dictionary){
            set.add(st);
        }
        return solve(s,set,0,memo);
    }
    public int solve(String s,Set<String>set,int i,int memo[]){
        if(i==s.length()){
            return 0;
        }
        if(memo[i]!=-1){
            return memo[i];
        }
        int minExt=1+solve(s,set,i+1,memo);

        for(int j=i;j<s.length();j++){
            String curr=s.substring(i,j+1);
            if(set.contains(curr)){
            minExt=Math.min(minExt,solve(s,set,j+1,memo));
            }
        }
        return memo[i]=minExt;
    }
}