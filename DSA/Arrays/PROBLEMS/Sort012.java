import java.util.Arrays;
import java.util.Scanner;


public class Sort012 {
    public static void optimal(int []arr,int n){
        int low=0,mid=0;
        int high=n-1;
        while (mid<=high) {
            if(arr[mid]==0){
                int t=arr[mid];
                arr[mid]=arr[low];
                arr[low]=t;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int t=arr[mid];
                arr[mid]=arr[high];
                arr[high]=t;
               high--;
            }
        }
    }
    public static void bruteforce(int []arr,int n){
        Arrays.sort(arr);
    } 
    public static void better(int arr[],int n){
        int c0=0,c1=0,c2=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                c0++;
            }
            else if(arr[i]==1){
                c1++;
            }
            else{
                c2++;
            }
        }
        for(int i=0;i<c0;i++){
            arr[i]=0;
        }
        for(int i=c0;i<c0+c1;i++){
            arr[i]=1;
        }
        for(int i=c1+c0;i<n;i++){
            arr[i]=2;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
      
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        bruteforce(arr, n);
        System.out.println("brute force approach:"+Arrays.toString(arr));
        better(arr, n);
        System.out.println("better approach:"+Arrays.toString(arr));
        optimal(arr, n);
        System.out.println("optimal approach:"+Arrays.toString(arr));
    }
    
}
