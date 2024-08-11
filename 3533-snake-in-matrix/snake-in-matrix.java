class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int count=0;

        for(int i=0;i<commands.size();i++){
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