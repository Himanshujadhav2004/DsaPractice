import java.util.*;

// why we start the loop from 1 because we consider the first element is the sorted;

public class Main {
    public static void main(String[] args) {
     Scanner sc  = new Scanner(System.in);

     int n =sc.nextInt();
     int arr[] =new int[n];

     for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
     }
     for(int i=1;i<n;i++){
     int j=i;
     while(j>0 && arr[j-1]>arr[j]){
      int temp = arr[j];
      arr[j]=arr[j-1];
      arr[j-1]=temp;
      j--;
     }
     }

     for(int i=0;i<n;i++){
      System.out.print(" "+arr[i]);
     }
    }
}