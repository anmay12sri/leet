class CustomStack {
     List<Integer>list;
     int size;
     int cursize=0;
    public CustomStack(int maxSize) {
       list=new ArrayList<>();
       size=maxSize; 
    }
    
    public void push(int x) {
         if(cursize<size){
            list.add(x);
            cursize++;
         }
         
    }
    
    public int pop() {
        if(cursize!=0){
            cursize--;
            return list.remove(list.size()-1);
        }else{
            return -1;
        }
    }
    
    public void increment(int k, int val) {
        for(int count=0;count<Math.min(k,cursize);count++){
            list.set(count,list.get(count)+val);

        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */