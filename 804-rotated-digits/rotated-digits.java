class Solution {
    public int rotatedDigits(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
        String s= String.valueOf(i);
        if(s.contains("2")|| s.contains("5")||s.contains("6")||s.contains("9")){
            if(!s.contains("3")&&(!s.contains("7") )&&(!s.contains("4"))){
                count++;
            }
        }
        }
        return count;
    }
}