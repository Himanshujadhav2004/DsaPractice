class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        //brute force
// int ans [][] =new int[n][m];
//         for(int i =0;i<n;i++){
//             for(int j =0;j<m;j++){
// ans[j][n-i-1]=matrix[i][j];
//             }
//         }
// for(int i =0;i<n;i++){
// for(int j =0;j<m;j++){
// matrix[i][j]=ans[i][j];
//             }
//         }

//optimal
//transpose
for(int i =0;i<n-1;i++){
for(int j=i+1;j<n;j++){
    int temp = matrix[i][j];
    matrix[i][j]=matrix[j][i];
    matrix[j][i]=temp;
}
}

//[0,1] -> [1,0]
//[0,2] -> [2,0]
//[0,3] ->[3,0]
//[1,2] ->[2,1]
//[1,3] ->[3,1]
//[2,3] ->[3,2]


//reverse
//eg-1,4,7
// to 7,4,1
for(int  i =0;i<n;i++){
    int left=0;
    int right=n-1;


    while(left<right){
        int temp  = matrix[i][left];
        matrix[i][left]=matrix[i][right];
        matrix[i][right]=temp;
        left++;
        right--;
    }
}
    }
}