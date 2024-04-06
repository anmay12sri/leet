class Solution {
    public String minRemoveToMakeValid(String s) {
        char []chars=s.toCharArray();
        StringBuilder st=new StringBuilder();
        int openwala=0;
        for(int i=0;i<chars.length;i++){
            char c=chars[i];

            if(c=='('){
                openwala++;
            }else if(c==')'){
                if(openwala==0){
                    chars[i]='*';
                }else{
                    openwala--;
                }
            }
        }
            for( int  i=chars.length-1;i>=0 && openwala>0;i--){
                // char c=s.charAt(i);
                if(chars[i]=='('){
                    chars[i]='*';
                    openwala--;
                }
                // continue;
            }
        
        // StringBuilder st=new StringBuilder();
        for(char c:chars){
        if(c!='*'){
            st.append(c);
        }
        }
        return st.toString();
    }
}