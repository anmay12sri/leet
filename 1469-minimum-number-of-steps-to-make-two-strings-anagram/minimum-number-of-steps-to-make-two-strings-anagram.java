class Solution {
    public int minSteps(String s, String t) {
        int count[]=new int[26];
        int sum=0;
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;//bab 2 1
            count[t.charAt(i)-'a']--;//aba  1 2
        }

        for(int i:count){
            if(i>=0){
              sum+=i;
            }
        }
        System.gc();
        return sum;
    }
}