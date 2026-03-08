import java.util.*;
public class TwoSum{
    public static int[] optimal(int arr[],int n,int target){
        int i=0;
        int j=n-1;
        while (i<=j) {
            if(arr[i]+arr[j]==target){
                return new int[]{i,j};
            }
            i++;
            j--;
        }
        return new int[]{-1,-1};
    }
    public static int[] bruteforce(int arr[],int n,int target){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] better(int []arr,int n,int target){
        int sum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            //sum+=arr[i];
            int rem=target-arr[i];
            if(map.containsKey(rem)){
                return new int[]{i,map.get(rem)};
            }
            map.put(arr[i],i);

        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
      
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("brute force approach:"+Arrays.toString(bruteforce(arr, n, 14)));
        System.out.println("better  approach:"+Arrays.toString(better(arr, n, 14)));
        System.out.println("optimal  approach:"+Arrays.toString(optimal(arr, n, 14)));
    }
}