import java.util.*;

public class Main {

    static void mergesort(int arr[], int low, int high) {

        if (low >= high)
            return;

        int mid = low + (high - low) / 2;

        mergesort(arr, low, mid);
        mergesort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    static void merge(int arr[], int low, int mid, int high) {

        List<Integer> lst = new ArrayList<>();
       
        int left = low;
        int right = mid + 1;

// comaring the left arr and the right arr 
// and adding to the result
        while (left <= mid && right <= high) {

            if (arr[left] <= arr[right]) {
                lst.add(arr[left]);
                left++;
            } else {
                lst.add(arr[right]);
                right++;
            }
        }

// if some of the elemet get remain so add them 
        while (left <= mid) {
            lst.add(arr[left]);
            left++;
        }

        while (right <= high) {
            lst.add(arr[right]);
            right++;
        }


//copy back to the orginal array;
        for (int i = low; i <= high; i++) {
            arr[i] = lst.get(i - low);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        mergesort(arr, 0, n - 1);

        for (int x : arr)
            System.out.print(x + " ");
    }
}