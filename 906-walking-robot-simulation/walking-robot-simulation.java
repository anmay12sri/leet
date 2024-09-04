class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int [][]directions={{0,1}, {1,0}, {0,-1}, {-1,0}};
        
        Set<String>obstacleset=new HashSet<>();
        for(int[]obstacle:obstacles){
            obstacleset.add(obstacle[0]+ ","+obstacle[1]);
        }
        int x=0,y=0;
        int direction=0;
        int max=0;

        for(int command:commands){
            if(command==-1){
                direction=(direction+1)%4;
            }else if(command==-2){
                direction=(direction+3)%4;
            }else{
                for(int i=0;i<command;i++){
                    int nx=x+directions[direction][0];
                    int ny=y+directions[direction][1];

                    if(!obstacleset.contains(nx+","+ ny)){
                        x=nx;
                        y=ny;
                        max=Math.max(max,x*x+y*y);
                    }else{
                        break;
                    }
                }
            }
        }
        return max;
    }
}