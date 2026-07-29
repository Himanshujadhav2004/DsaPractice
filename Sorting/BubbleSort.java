import java.util.*;

// check the adjacent element and swap and in the each phases there is an highest leement in the last means move the max to the last
//time complexity (O) n^2
public class Main {
    public static void main(String[] args) {
     Scanner sc  = new Scanner(System.in);

     int n =sc.nextInt();
     int arr[] =new int[n];

     for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
     }
     for(int i=0;i<n-1;i++){
      for(int j=0;j<n-i-1;j++){
        
        if(arr[j]>arr[j+1]){
          int temp =arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
     }

     for(int i=0;i<n;i++){
      System.out.print(" "+arr[i]);
     }
    }
}