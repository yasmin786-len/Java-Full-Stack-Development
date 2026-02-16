import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("enter target you want to search?");
        int target=sc.nextInt();

        int f=-1;
        for(int h:arr){
            if (h==target) {
                f=0;
                System.out.println("Element found");
                break;
            }
        }
        if (f==-1) {
            System.out.println("Element not found..");
        }
    }
    
}
