import java.util.Arrays;
import java.util.Scanner;

public class SmallElement
{
     public static int better(int arr[]){
        if(arr.length==1) return arr[0];
        Arrays.sort(arr);
        return arr[0];
    }
    public static int bruteForce(int arr[]){
        int small=-1;
        for(int i=0;i<arr.length;i++){
            small=arr[i];
            for(int j=0;j<arr.length;j++){
                if(small>arr[j]){
                    small=arr[j];
                }
            }
        }
        return small;
    }
    public static int optimal(int arr[]){
        int small=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Brute Force Approach");
        System.out.println("smallest element is: "+bruteForce(arr));
        System.out.println("Better approach:");
        System.out.println("smallest element is: "+better(arr));
        System.out.println("Optimal Approach");
        System.out.println("smallest element is: "+optimal(arr));
    }    
}
