class Solution {
    public String customSortString(String order, String s) {
        int count[]=new int[26];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;//a=1 b=1 c=1 d=1 other 0
        }
        StringBuilder st=new StringBuilder();

        for(int i=0;i<order.length();i++){
            char c=order.charAt(i);
            while(count[c-'a']>0){
                st.append(c);
                count[c-'a']--;
            }
        }

        for(int i=0;i<26;i++){
            while(count[i]>0){
                st.append((char) ('a'+i));
                count[i]--;
            }
        }
        return st.toString();

    }
}