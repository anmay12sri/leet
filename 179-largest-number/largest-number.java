class Solution {
    public String largestNumber(int[] nums) {
        String elements[]=new String[nums.length];

        for(int i=0;i<nums.length;i++){
            elements[i]=Integer.toString(nums[i]);
        }

        Arrays.sort(elements,new Comparator<String>(){
            public int compare(String a,String b){
               String first=a+b;
               String sec=b+a;
               return sec.compareTo(first); 
            }
        });
        //special case
        if(elements[0].equals("0")){
            return "0";
        }

        String res="";
        for(String x:elements){
            res+=x;
        }
        return res;
    }
}