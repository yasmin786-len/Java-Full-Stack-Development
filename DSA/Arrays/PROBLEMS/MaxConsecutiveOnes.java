import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static int optimal(int []arr,int n){
        int c=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                c++;
                max=Math.max(max,c);
            }
            else{
                c=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
      
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("maximum number of consecutive ones : "+optimal(arr, n));
    }
    
}
