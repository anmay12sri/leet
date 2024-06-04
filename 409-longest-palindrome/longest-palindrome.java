class Solution {
    public int longestPalindrome(String s) {
       Map<Character,Integer>map=new HashMap<>();
       int two=0;
       int one=0;

       for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
       }

       for(Map.Entry<Character,Integer>e:map.entrySet()){
           int count=e.getValue();
           if(count>1){
               two+=(count/2)*2;
           }
           if(count%2==1){
            one=1;
           }
       }
       return two+one;

    }
}