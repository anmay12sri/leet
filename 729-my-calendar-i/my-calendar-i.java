class MyCalendar {
    private ArrayList<int[]>bookings;
    public MyCalendar() {
        bookings=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int event[]:bookings){
            int existstart=event[0];
            int existend=event[1];

            if(start<existend && end>existstart ){
                return false;
            }
        }
        bookings.add(new int[]{start,end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */