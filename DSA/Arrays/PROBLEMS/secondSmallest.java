import java.util.Arrays;
import java.util.Scanner;

class secondSmallest
{
    public static int bruteForce(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                return arr[i+1];
            }
        }
        return -1;
    }
    public static int better(int arr[]){
        int small=Integer.MAX_VALUE;
        int sl=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] < small) {
            small = arr[i];
        }
    }

    for (int i = 0; i < arr.length; i++) {
        if (small< arr[i] && arr[i] <sl) {
            sl = arr[i];
        }
    }
        return sl;
    }
    public static int optimal(int arr[]){
        int small=arr[0];
        int ss=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(small>arr[i]){
                ss=small;
                small=arr[i];
            }
            else if(arr[i]>small && ss>arr[i] ){
                ss=arr[i];
            }
        }
        return ss;
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
        System.out.println("second smallest element is: "+bruteForce(arr));
        System.out.println("Better approach:");
        System.out.println("second smallest element is: "+better(arr));
        System.out.println("Optimal Approach");
        System.out.println("second smallest element is: "+optimal(arr));
    }
}