//Set Matrix Zeroes
class Solution {
    public void setZeroes(int[][] matrix) {
        
       

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(matrix[i][j]==0){
        //             markrow(i,m,matrix);
        //             markcol(j,n,matrix);
        //         }
        //     }
        // }

        // for(int i =0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //            if(matrix[i][j]==-10){
        //            matrix[i][j]=0;
        //         }
        //     }
        // }
//optimal
 int n =matrix.length;
        int m =matrix[0].length;
        int  col []= new int [m];
        int row[] = new int [n];

        for(int i=0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(matrix[i][j]==0){
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(row[i] ==1 || col[j]==1){
                    matrix[i][j]=0;
                }
            }
        }
    }

    // public void markrow(int i,int m,int [][]matrix){
    //     for(int j=0;j<m;j++){
    //         if(matrix[i][j]!=0){
    //             matrix[i][j]=-10;
    //         }
    //     }
    // }

    //   public void markcol(int j,int n,int [][]matrix){
    //     for(int i=0;i<n;i++){
    //         if(matrix[i][j]!=0){
    //             matrix[i][j]=-10;
    //         }
    //     }
    
}