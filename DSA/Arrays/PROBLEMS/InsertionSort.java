import java.util.Scanner;

public class InsertionSort {
    public static void sort(int[]arr,int n){
        int i=0;
        while (i<n) {
            int j=i;
            while (j>0 && arr[j]<arr[j-1]) {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
            i++;
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

        System.out.println("Insertion sort:");
        sort(arr, n);
        for(int m:arr){
            System.out.print(m+" ");
        }
    }
    
}
