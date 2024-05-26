class Solution {
    public String compressedString(String word) {
        StringBuilder s=new StringBuilder();
        char prev=word.charAt(0);
        int count=1;
        for(int i=1;i<word.length();i++){
            char ch=word.charAt(i);
            if(ch==prev){
                count++;
                if(count==9){
                    s.append("9"+ch);
                    count=0;
                }
            }else{
                if(count!=0)s=s.append((String.valueOf(count)+prev));
                count=1;
                prev=ch;
            }
        }
        if(count!=0)s=s.append((String.valueOf(count)+prev));
        return s.toString();
    }
}