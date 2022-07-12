class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
       
    }
    public void transpose(int[][] matrix){
        int[][] isvisited=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                isvisited[i][j]=0;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(isvisited[i][j]==0){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
                    isvisited[i][j]=1;
                    isvisited[j][i]=1;
                }
                
            }
        }
         int m=matrix[0].length;
        //System.out.println(m);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length/2;j++){
                //System.out.println(matrix[i][j] + "check"+matrix[i][m-j-1]);
                 int temp=matrix[i][j];
                matrix[i][j]=matrix[i][m-j-1];
                 matrix[i][m-j-1]=temp;
                 
            }
        }
        
    }
}