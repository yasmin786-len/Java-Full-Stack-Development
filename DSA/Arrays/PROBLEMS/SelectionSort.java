import java.util.Scanner;

class SelectionSort{
    public static void sort(int arr[],int n){
        int i=0;
        while (i<n) {
            int min=Integer.MAX_VALUE;
            int mini=-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
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

        System.out.println("selection sort:");
        sort(arr, n);
        for(int m:arr){
            System.out.print(m+" ");
        }

    }
}