import java.util.Scanner;

public class LeftRotate {
    public static void optimal(int []arr){
        if (arr.length==0) {
            return;
        }
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
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

        System.out.println("Brute Force Approach: ");
        optimal(arr);
        printArray(arr);

    }
    
}
