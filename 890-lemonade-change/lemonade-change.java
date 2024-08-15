class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives=0;
        int tens=0;
        int twenties=0;

        for(int bill:bills){
            if(bill==5){
                fives++;//2
            }else if(bill ==10){
                if(fives==0)return false;
                tens++;//2
                fives--;//1
            }else if(bill==20){
                if(fives>0 && tens>0 ){
                    fives--;//0
                    tens--;//1
                     
                }else if(fives>2){
                    fives-=3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}