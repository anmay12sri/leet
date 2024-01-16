class RandomizedSet {
      Set<Integer>S;
      List<Integer>list;
    public RandomizedSet() {
        S=new HashSet<>();
        list=new ArrayList<>();
    }
    
    public boolean insert(int val) {
       if(S.size()==0 || !S.contains(val)){
           S.add(val);
           list.add(val);
           return true;
       }
       return false;
    }
    
    
    public boolean remove(int val) {
       if(S.contains(val)){
           S.remove(val);
           list.remove(Integer.valueOf(val));
           return true;

       }
       return false;
    }
    
    public int getRandom() {
       return list.get(new Random().nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */