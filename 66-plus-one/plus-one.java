class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }else if(digits[i]==9){
                 digits[i]=0;
            }
        }

        int newdig[]=new int[digits.length+1];
        newdig[0]=1;
        return newdig;
            
        
        
    }
}