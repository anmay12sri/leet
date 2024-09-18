class Solution {
    public String largestNumber(int[] nums) {
        String elements[]=new String[nums.length];

        for(int i=0;i<nums.length;i++){
            elements[i]=Integer.toString(nums[i]);
        }

        // Arrays.sort(elements,new Comparator<String>(){
        //     public int compare(String a,String b){
        //        String first=a+b;
        //        String sec=b+a;
        //        return sec.compareTo(first); 
        //     }
        // });
        Arrays.sort(elements,(a,b)->(b+a).compareTo(a+b));
        //special case
        if(elements[0].equals("0")){
            return "0";
        }

        // String res="";
        StringBuilder st=new StringBuilder();
        for(String x:elements){
            st.append(x);
        }
        return st.toString();
    }
}