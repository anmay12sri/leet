class Solution {
    public int countSeniors(String[] details) {
       int count=0;
       for(int i=0;i<details.length;i++){
        String s=details[i];
        if((((s.charAt(11)-'0')*10)+s.charAt(12)-'0')>60){
            count++;
        }
       }
       return count; 
    }
}