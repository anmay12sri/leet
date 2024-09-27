class MyCalendarTwo {
    List<int[]>addkrna;
    List<int[]>doublebook;

    public MyCalendarTwo() {
       addkrna= new ArrayList<>();
       doublebook=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
         
         for(int []event: doublebook){
            if(Math.max(start,event[0]) < Math.min(end,event[1])){
                return false;
            }
         }

         for(int []event: addkrna){
            if(Math.max(start,event[0]) < Math.min(end,event[1])){
                doublebook.add(new int[]{Math.max(start,event[0]), Math.min(end,event[1])});
            }
         }
         addkrna.add(new int[]{start,end});
         return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */