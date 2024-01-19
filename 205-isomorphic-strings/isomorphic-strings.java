class Solution {
    public boolean isIsomorphic(String s, String t) {
       //200 size because there are 128 characters
        int map1[]=new int[200];//egg
        int map2[]=new int[200];//add

        for(int i=0;i<s.length();i++){
            if(map1[s.charAt(i)]!=map2[t.charAt(i)])//means e!=d only e==a
            return false;

            map1[s.charAt(i)]=i+1;//e=1 a=1 at i=0
            map2[t.charAt(i)]=i+1;//g=2 d=2 at i=1
            //g=3 d=3 at i=2 so true because value is not unequal
            //adb g=3 b=0
        }
        return true;
    }
}