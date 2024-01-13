class Solution {
    public int minSteps(String s, String t) {
        int arr_s[]=new int[26];
        int arr_t[]=new int[26];
        int count=0;

        for(int i=0;i<s.length();i++){
            arr_s[s.charAt(i)-'a']++;//bab 1 2
            arr_t[t.charAt(i)-'a']++;// aba 2 1

        
        }

        for(int i=0;i<26;i++){
            if(arr_s[i]>arr_t[i]){
               count+=arr_s[i]-arr_t[i]; 
            }
        }
        return count;
    }
}