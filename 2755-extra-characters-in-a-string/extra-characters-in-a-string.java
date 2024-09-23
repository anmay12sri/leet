class Solution {
    
    public int minExtraChar(String s, String[] dictionary) {
        int n=s.length();
        Set<String>set=new HashSet<>();
        for(String st:dictionary){
            set.add(st);
        }
        int memo[]=new int[s.length()];
        Arrays.fill(memo,-1);
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

        for(int end=i;end<s.length();end++){
            String curr=s.substring(i,end+1);
            if(set.contains(curr)){
                minExt=Math.min(minExt,solve(s,set,end+1,memo));
            }
        }
        return memo[i]=minExt;
    }
}