class MyHashSet {
     boolean[]arr;//declaration
    public MyHashSet() {
      arr=new boolean[1000001];//size ka naya array
    }
    
    public void add(int i) {
       arr[i]=true; //true ho toh add hoga
    }
    
    public void remove(int i) {
        arr[i]=false; //false wala remove ke liye
    }
    
    public boolean contains(int i) {
        return arr[i];//end mein pura arr return
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */