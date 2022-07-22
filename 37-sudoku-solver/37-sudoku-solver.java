class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][]board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(int k=1;k<=9;k++){
                        char c=(char)(k+'0');
                         //System.out.println(c);
                        if(isvalid(board,i,j,c)){
                            board[i][j]=c;
                            if(solve(board))return true;
                            else
                                board[i][j]='.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isvalid(char[][] board,int row,int col,char k){
        for(int i=0;i<board.length;i++){
            if(board[i][col]==k)return false;
            if(board[row][i]==k)return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3]==k)return false;
        }
        return true;
        
    }
}