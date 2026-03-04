import java.util.HashSet;
import java.util.Scanner;

class RemoveDuplicates{
    public static int bruteForce(int arr[],int n){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        return set.size();
        
    }
    public static int optimal(int []arr,int n){
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
               arr[i+1]=arr[j];
               i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array(enter array elements sortedly)");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("bruteforce answer:"+ bruteForce(arr, n));
        System.out.println("optimal answer:" + optimal(arr, n));


    }
}