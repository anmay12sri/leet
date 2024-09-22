class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        
        Set<String>banned1=new HashSet<>();// for fast lookup

        for(String x:bannedWords){
            banned1.add(x);
        }
        int count=0;

        for(String msg:message){
            if(banned1.contains(msg)){
                count++;
            }
            if(count>=2){
                return true;// spam
            }
        }
        return false;//otherwise if no spam
        
    }
}