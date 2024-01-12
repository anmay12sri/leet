class Solution {
    public boolean halvesAreAlike(String s) {
        int count1=0;//for first half
        int count2=0;//for second half
        //first of all convert this into lowercase
        s=s.toLowerCase();

        //now using loop count vowel in first half
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
            s.charAt(i)=='o'||s.charAt(i)=='u'){
                count1++;
            }
        }
            //for second half
            for(int i=s.length()/2;i<s.length();i++){
               if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
               s.charAt(i)=='o'||s.charAt(i)=='u'){
                 count2++;
                      }
               } 
            
        return count1==count2;
    }
}