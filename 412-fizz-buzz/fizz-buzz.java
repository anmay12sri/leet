class Solution {
    public List<String> fizzBuzz(int n) {
        List<String>arr=new LinkedList<>();
        for(int i=1;i<=n;i++){
            if(i%15==0){//3 aur 5 ek sath leliya
                arr.add("FizzBuzz");
            }else if(i%3==0){
                arr.add("Fizz");//3 pr fizz
            }else if(i%5==0){
                arr.add("Buzz");//5 pr buzzz
            }else{
                arr.add(String.valueOf(i));//nahi toh voh same i ki value
            }
        }
        return arr;
    }
}