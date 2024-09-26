class MyCalendar {
    private ArrayList<int[]>bookings;

    public MyCalendar() {
        bookings=new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for(int event[]:bookings){
            int existingstart=event[0];
            int existingend=event[1];

            if(start< existingend && end>existingstart){
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