import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        // LinkedHashMap<Character,Integer> map =new LinkedHashMap<>();
        // int n=str.length();

        // for(int i=0;i<n;i++){
        //     map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        // }

        // for(Map.Entry<Character,Integer> entry :map.entrySet()){
        //     System.out.println(entry.getKey()+""+entry.getValue());
        // }

        String arg []= str.split(" ");
        int arr[]=new int [arg.length];
        for(int i=0;i<arg.length;i++){
            arr[i]=Integer.parseInt(arg[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}