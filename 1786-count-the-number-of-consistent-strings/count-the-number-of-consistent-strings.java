class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       
        int count=0;
        Set<Character>set=new HashSet<>();
        for(char c : allowed.toCharArray()){
           set.add(c);
        }
        for(String word:words){
            boolean consistent=true;
             for(char ch:word.toCharArray()){
                if(!set.contains(ch)){
                    consistent=false;
                    break;
                }
             }
             if(consistent){
                count++;
             }
            }
            
        return count;
        }
       
    
}