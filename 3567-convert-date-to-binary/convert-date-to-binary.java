class Solution {
    public String convertDateToBinary(String date) {
        String part[]=date.split("-");

        String yearBin=Integer.toBinaryString(Integer.parseInt(part[0]));
        String monthBin=Integer.toBinaryString(Integer.parseInt(part[1]));
        String dateBin=Integer.toBinaryString(Integer.parseInt(part[2]));

        return yearBin +'-'+monthBin + '-'+dateBin;
    }
}