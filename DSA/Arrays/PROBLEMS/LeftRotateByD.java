import java.util.Scanner;

public class LeftRotateByD {
    public static void reverse(int []arr,int start,int end){
        int i=start;
        int j=end;
        while (i<=j) {
            int t=arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
    }
    public static void optimal(int []arr,int d){
        d=d%arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,arr.length-1);
        reverse(arr,0,arr.length-1);
    }
    public static void bruteForce(int []arr,int d){
        d=d%arr.length;
        if (arr.length==0) {
            return;
        }
        for(int i=0;i<d;i++){
        int temp=arr[0];
        for(int j=0;j<arr.length-1;j++){
            arr[j]=arr[j+1];
        }
        arr[arr.length-1]=temp;
    }
    }
    public static void printArray(int []arr){
        for(int n:arr){
            System.out.print(n+" ");
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
       System.out.println("enter how many times want to rotate array left ?");
        int d=sc.nextInt();
        System.out.println("Brute Force Approach: ");
        bruteForce(arr,d);
        printArray(arr);

        System.out.println("Optimal Approach:");
        optimal(arr, d);
        printArray(arr);

    }
    
}
