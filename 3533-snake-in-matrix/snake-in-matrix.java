class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
         int count=0;
        int x=commands.size();
        for(int i=0;i<x;i++){
            String command=commands.get(i);
            if(command.equals("RIGHT")){
                count++;
            }else if(command.equals("LEFT")){
                count--;
            }else if(command.equals("DOWN")){
                count+=n;
            }else if(command.equals("UP")){
                count-=n;
            }
        }
        return count;
    }
}