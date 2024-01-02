class Solution {
    public double[] convertTemperature(double celsius) {
        double f =(1.80*celsius)+32.00;
        double k=celsius+273.15;

        return new double[]{k,f};
       
    }
}