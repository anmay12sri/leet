class Solution {
    public int findTheLongestSubstring(String s) {
      Map<Character,Integer>vowels=new HashMap<>();
      vowels.put('a',0);  
      vowels.put('e',1);  
      vowels.put('i',2);  
      vowels.put('o',3);  
      vowels.put('u',4);

      Map<Integer,Integer>bitmap=new HashMap<>();
      bitmap.put(0,-1);
      int max=0,curr=0;

      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(vowels.containsKey(ch)){
            curr^=(1<<vowels.get(ch));
        }
        if(!bitmap.containsKey(curr)){
            bitmap.put(curr,i);
        }else{
            max=Math.max(max,i-bitmap.get(curr));
        }

      }  
      return max;
    }
}