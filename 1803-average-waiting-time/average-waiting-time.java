class Solution {
    public double averageWaitingTime(int[][] customers) {
        double wait=customers[0][1];//2
        int finished=customers[0][0]+customers[0][1];//3

        for(int i=1;i<customers.length;i++){
            finished=Math.max(finished,customers[i][0])+customers[i][1];//3+5=8
            wait+=finished-customers[i][0];//2+8-2
        }
        return wait/customers.length;//15/3
    }
}