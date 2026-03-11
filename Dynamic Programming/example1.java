import java.util.Scanner;

public class example1 {
    public static int fib(int n){
        int a=0;
        int b=1;
        int i=3;
        int c=0;
        while (i<=n) {
            c=a+b;
            a=b;
            b=c;
            i++;
        }
        return c;
    }
    public static int recursion(int n){
        if (n==1 ) {
            return 0;
        }
        if (n==2) {
            return 1;
        }
        return recursion(n-1)+recursion(n-2);
    }
    public static int dp(int arr[],int n){
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n-2];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
        System.out.println(recursion(n));
        int arr[]=new int[n+1];
        System.out.println(dp(arr, n+1));
    }
    
}
