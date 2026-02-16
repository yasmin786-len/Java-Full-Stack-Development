import java.util.Arrays;
import java.util.Scanner;

class LargestElement
{
    public static int better(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static int bruteForce(int arr[]){
        int large=-1;
        for(int i=0;i<arr.length;i++){
            large=arr[i];
            for(int j=0;j<arr.length;j++){
                if(large<arr[j]){
                    large=arr[j];
                }
            }
        }
        return large;
    }
    public static int optimal(int arr[]){
        int large=arr[0];
        for(int i=1;i<arr.length;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        return large;
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
        System.out.println("largest element is: "+bruteForce(arr));
        System.out.println("Better approach:");
        System.out.println("largest element is: "+better(arr));
        System.out.println("Optimal Approach");
        System.out.println("largest element is: "+optimal(arr));
    }
}