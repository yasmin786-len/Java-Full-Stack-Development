import java.util.Scanner;

public class FindingMissedNumber {
    public static int bruteforce(int [] arr,int n){
        boolean isfound=false;
        for(int i=1;i<=n;i++){
            isfound=false;
            for(int j=0;j<n-1;j++){
                if(arr[j]==i){
                    isfound=true;
                    break;
                }
            }
            if (!isfound) {
                return i;
            }
        }
        return -1;
    }

    public static int better(int []arr,int n){
        int a[]=new int[n+1];
        for(int i=0;i<n-1;i++){
            a[arr[i]]++;
        }
        for(int i=1;i<a.length;i++){
            if(a[i]==0){
                return i;
            }
        }
        return -1;
    }

    public static int optimal(int []arr,int n){
        int sum=0;
        n=n*(n+1)/2;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return n-sum;
      
    }
    public static int bestOptimal(int []arr,int n){
        int xor=0;
        for(int i=1;i<=n;i++){
            xor=xor^i;
        }
        int x=0;
        for(int i=0;i<n-1;i++){
            x=x^arr[i];
        }
        return x^xor;
    }
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
      
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("brute force:"+bruteforce(arr, n));
        System.out.println("better approach:"+better(arr, n));
        System.out.println("optimal approach:"+optimal(arr, n));
        System.out.println("better optimal:"+bestOptimal(arr, n));
    }
    
}
