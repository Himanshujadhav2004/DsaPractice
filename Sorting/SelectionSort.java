import java.util.*;


// there is only two step

//one is find the minimum
//second swap between i and min;


//total step = n-1; means total swap are n-1;

//time complexity is (o)n^2;
public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n =sc.nextInt();
     int arr[] =new int [n];

     for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
     }


     for(int i=0;i<n-1;i++){
      int min =i;

      for(int j=i+1;j<n;j++){
        if(arr[j]<arr[min]) min=j;
      }
      int temp = arr[min];
      arr[min]=arr[i];
      arr[i]=temp;
     }

     for(int i=0;i<n;i++){
      System.out.println(arr[i]);
     }
    }
}