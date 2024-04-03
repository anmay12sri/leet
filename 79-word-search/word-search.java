class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,word,i,j,0))return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][]board,String word,int i,int j,int ind){
        if(ind==word.length())return true;//we got the length of word is same as ind

        if(i<0||i>=board.length ||j<0||j>=board[0].length||board[i][j]!=word.charAt(ind)){
            return false;
        }

        char temp=board[i][j];//store the previous state
        board[i][j]=' ';

        boolean found= dfs(board,word,i+1,j,ind+1)||//down
          dfs(board,word,i-1,j,ind+1)||//up
          dfs(board,word,i,j+1,ind+1)||//right
          dfs(board,word,i,j-1,ind+1);//left
       
       board[i][j]=temp;

       return found;

    }
}