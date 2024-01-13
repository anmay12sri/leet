class Solution {
    public int minSteps(String s, String t) {
        //let's begin
        //take two arrays of length 26
        int arr_s[]=new int[26];
        int arr_t[]=new int[26];
        int count=0;

        //now we have to count the occurances of alphabets
        for(int i=0;i<s.length();i++){
            arr_s[s.charAt(i)-'a']++;//bab b=98 ascii a=97 so b=1 and ++ so b=2 a=1
            arr_t[t.charAt(i)-'a']++;//same for the t also
        }

        for(int i=0;i<26;i++){
            if(arr_s[i]>arr_t[i]){//we will only subtract from the s
                count+=arr_s[i]-arr_t[i];
            }
        }
        return count;
        
    }
}