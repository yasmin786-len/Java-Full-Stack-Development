import java.util.*;
class example{
    public static  int sum2(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=2;
        }
        return sum;
    }
    public static int recursion(int n){
        if(n==1){
            return 2;
        }
        return recursion(n-1)+2;
    }
    public static int dp(int arr[],int n){

        arr[0]=0;
        arr[1]=2;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+2;
        }
        return arr[n-1];
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum2(n));

        System.out.println(recursion(n));
        int arr[]=new int[n+1];
        System.out.println("Solution by dynamic programming");
        System.out.println(dp(arr, n+1));
    }
}
