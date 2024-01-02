class Solution {
    public double average(int[] salary) {
        double sum=0;
        double x=0;
        
        Arrays.sort(salary);
        for(int i=0;i<salary.length;i++){
            sum+=salary[i];//10,000
            x=sum-(salary[0]+salary[salary.length-1]);
           
        }
        return x/(salary.length-2);
        
    }
}