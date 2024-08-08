class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int direction[][]={{0,1},{1,0},{0,-1},{-1,0}};
        int res[][]= new int[rows*cols][2];
        int steps=0,dir=0;
        int count=1;

        res[0]=new int[]{rStart,cStart};
         

        while(count<rows*cols){
            if(dir==0||dir==2)steps++;//east or west direction tbhi step increase hoga

            for(int i=0;i<steps;i++){
                rStart+=direction[dir][0];//x
                cStart+=direction[dir][1];//y

                if(rStart>=0 && rStart<rows && cStart>=0 && cStart<cols){
                    res[count]=new int[]{rStart,cStart};//not out of bound toh add
                    count++;
                }
                if(count==rows*cols) return res;
            }
            dir=(dir+1)%4;
        }
        return res;
    }
}