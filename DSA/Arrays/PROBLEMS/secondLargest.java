import java.util.Arrays;
import java.util.Scanner;

class secondLargest
{
    public static int bruteForce(int arr[]){
        Arrays.sort(arr);
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]!=arr[i-1]){
                return arr[i-1];
            }
        }
        return -1;
    }
    public static int better(int arr[]){
        int large=-1;
        int sl=-1;
        for (int i = 0; i < arr.length; i++) {
        if (arr[i] > large) {
            large = arr[i];
        }
    }


    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > sl && arr[i] < large) {
            sl = arr[i];
        }
    }
        return sl;
    }
    public static int optimal(int arr[]){
        int large=arr[0];
        int sl=-1;
        for(int i=1;i<arr.length;i++){
            if(large<arr[i]){
                sl=large;
                large=arr[i];
            }
            else if(arr[i]<large && sl<arr[i] ){
                sl=arr[i];
            }
        }
        return sl;
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
        System.out.println("second largest element is: "+bruteForce(arr));
        System.out.println("Better approach:");
        System.out.println("second largest element is: largest element is: "+better(arr));
        System.out.println("Optimal Approach");
        System.out.println("second largest element is: largest element is: "+optimal(arr));
    }
}