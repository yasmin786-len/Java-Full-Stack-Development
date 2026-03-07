import java.util.Scanner;

public class NumberOnce {
    public static int bruteforce(int arr[],int n){
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if (arr[i]==arr[j]) {
                    c++;
                }
            }
            if (c==1) {
                return arr[i];
            }
        }
        return -1;
    }
    public static int better(int []arr,int n){
        int a[]=new int[n+1];
        for(int i=0;i<n;i++){
            a[arr[i]]++;
        }
        for(int i=1;i<a.length;i++){
            if(a[i]==1){
                return i;
            }
        }
        return -1;
    }

    public static int optimal(int []arr,int n){
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }
        return (xor==0)?-1:xor;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
      
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("brute force approach: "+bruteforce(arr, n));
        System.out.println("better approach: "+better(arr, n));
        System.out.println("optimal approach: "+optimal(arr, n));

    }
    
}
