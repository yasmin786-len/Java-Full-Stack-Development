import java.util.*;
public class SumK{
    public static int optimal(int []arr,int n,int k){
        int left=0;
        int maxi=0,sum=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];
            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxi=Math.max(maxi,right-left+1);
            }
        }
        return maxi;
    }
    public static int better(int []arr,int n,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxi=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum==k){
                maxi=Math.max(maxi,i+1);
            }
            int rem=sum-k;
            if(map.containsKey(rem)){
                maxi=Math.max(maxi,(i-map.get(rem)));
            }
            map.put(sum,i);
        }
        return maxi;
    }
    public static int bruteforce(int[]arr, int n,int k){
        int c=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    c=(j-i)+1;
                    maxi=Math.max(maxi,c);
                }
            }
        }
        return maxi;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
      
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("brute force approach is:"+bruteforce(arr,n,3));
        System.out.println("better approach:"+better(arr,n,3));
        System.out.println("optimal approach:"+optimal(arr,n,3));
    }
}