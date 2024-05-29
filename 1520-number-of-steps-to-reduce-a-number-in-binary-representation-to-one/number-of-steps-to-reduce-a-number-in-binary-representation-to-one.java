class Solution {
    public int numSteps(String s) {
        int count=0;
        int carry=0;
        for(int i=s.length()-1;i>=1;i--){
            int bit=s.charAt(i)-'0';
            if((bit+carry)%2==0){
                count++;
            }else{
                carry=1;
                count+=2;
            }
        }
        if(carry==1){
            count++;
        }
        return count;
    }
}