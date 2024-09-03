class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
         
        for(int i=0;i<s.length();i++){
            int diff = s.charAt(i) - 'a'+1;
            // String st = Integer.toString(diff);
            while(diff>0){
                sum+=diff%10;
                diff/=10;
            }
            
        }
        // String st=sb.toString();
        while (k-->1){// 1 baar pehle hi sum done hai
        int newsum=0;
               
             while(sum>0){
                newsum+=sum%10;
                sum/=10;
             }
            //  st=Integer.toString(sum);
            sum=newsum;
             
        }
        return sum;
    }
}