class Solution {
    public double averageWaitingTime(int[][] customers) {
        double waittime=customers[0][1];
        int n=customers.length;
        int finished=customers[0][0]+customers[0][1];//3

        for(int i=1;i<customers.length;i++){

            finished=Math.max(finished,customers[i][0])+customers[i][1];
            waittime+=finished-customers[i][0];
        }
        return waittime/n;
        
    }
}