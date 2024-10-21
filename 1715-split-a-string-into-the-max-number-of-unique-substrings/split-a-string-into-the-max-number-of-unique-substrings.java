class Solution {
    public int maxUniqueSplit(String s) {
        return backtrack(s,new HashSet<>(),0);
    }
    public int backtrack(String s, Set<String>set,int ind){
        if(ind==s.length()){
            return 0;
        }
        int max=0;
        for(int i=ind+1;i<=s.length();i++){
            String substr=s.substring(ind,i);
            if(!set.contains(substr)){
                set.add(substr);
                max=Math.max(max,1+backtrack(s,set,i));
            set.remove(substr);
            }
        }
        return max;
    }
}