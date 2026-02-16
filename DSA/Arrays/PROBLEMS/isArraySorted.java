import java.util.Scanner;

public class isArraySorted
{
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean f=true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]) {
            f=false;
            break;
        }
        }
        if (f) {
            System.out.println("array is sorted...");
        }
        else{
            System.out.println("array is not sorted...");
        }
        
    }    
}
