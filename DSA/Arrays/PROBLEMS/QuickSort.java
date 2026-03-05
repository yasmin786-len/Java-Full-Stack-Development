import java.util.Scanner;

public class QuickSort {
    public static int partition(int []arr,int low,int high){
        int pivot=arr[low];
        int i=low+1;
        int j=high;
        while (true) {
            
            while (i<=high && arr[i]<=pivot) {
                i++;
            }
            while (arr[j]>pivot) {
                j--;
            }
            if (i<j) {
                int t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
            else{
                break;
            }
        }
            int t=arr[low];
            arr[low]=arr[j];
            arr[j]=t;
        return j;
    }
    public static void quicksort(int []arr,int low,int high){
        if (low<high) {
            int p=partition(arr,low,high);
            quicksort(arr, low, p-1);
            quicksort(arr, p+1, high);
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

        System.out.println("Quic sort:");
        quicksort(arr, 0,n-1);
        for(int m:arr){
            System.out.print(m+" ");
        }
    }
    
}
