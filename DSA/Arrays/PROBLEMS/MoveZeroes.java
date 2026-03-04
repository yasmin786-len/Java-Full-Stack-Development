import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroes {
    public static void  bruteforce(int [] arr,int n){
        int temp[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[k++]=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    public static void optimal(int [] arr,int n){
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
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

        bruteforce(arr, n);
        System.out.println(Arrays.toString(arr));
        optimal(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    
}
