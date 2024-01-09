class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        //1,2,2,3,3,4,7,8
        int arr[]=new int[nums.length+1];//ek size jyada ka array to store nums wala array ki value as a index in arr
        ArrayList<Integer>list=new ArrayList<>();//ek list bnaa li

        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=nums[i];//index ke hisaab se sabne apni jagah leli aur baaki jagah 0 ajayega 
        }// jaise ki 4,1,2  toh arr wale mein iska 3 wale pe 0 aajayega

        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                list.add(i);// uss 0 ko hum apni list mein add krdenge and we will
                // gonna return our list
            }
        }
        return list;
    }
}