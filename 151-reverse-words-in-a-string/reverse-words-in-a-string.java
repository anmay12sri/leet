class Solution {
    public String reverseWords(String s) {
    //    String res="";
    //    String words[]=s.split("\\s+");
    //    for(String w:words){
    //        if(res=="")res=w;
    //        else res=w+" "+res;
    //    }
    //    return res;


    String word[]=s.split("\\s+");
    String res="";
    for(String w:word){
        if(res=="")res=w;
        else res=w+" "+res;
    }
    return res;
    }
}