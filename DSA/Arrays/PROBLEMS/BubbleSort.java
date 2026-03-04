import java.util.Scanner;

class BubbleSort{
    public static void sort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            boolean isswap=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                    isswap=true;
                }
            }
            if (!isswap) {
                return;
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

        System.out.println("Bubble sort:");
        sort(arr, n);
        for(int m:arr){
            System.out.print(m+" ");
        }
    }
}