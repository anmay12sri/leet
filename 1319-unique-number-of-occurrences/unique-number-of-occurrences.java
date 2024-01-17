class Solution {
    public boolean uniqueOccurrences(int[] arr) {
      Map<Integer,Integer>map=new HashMap<>();
      for(int num:arr){
          map.put(num,map.getOrDefault(num,0)+1);//1=3,2=2,3=1;//occurance
      }  
      Set<Integer>set=new HashSet<>();

      for(Map.Entry<Integer,Integer>e:map.entrySet()){
          if(set.contains(e.getValue())){
              return false;
          }else{
              set.add(e.getValue());
          }

      }
      return true;
    }
}