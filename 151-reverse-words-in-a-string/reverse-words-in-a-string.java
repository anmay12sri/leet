class Solution {
    public String reverseWords(String s) {
    //    String res="";
    //    String words[]=s.split("\\s+");
    //    for(String w:words){
    //        if(res=="")res=w;
    //        else res=w+" "+res;
    //    }
    //    return res;


     String st[]=s.trim().split("\\s+");

     String res="";

     for(int i=st.length-1;i>=0;i--){
        res+=st[i]+" ";
     }
     return res.trim();
    }
}