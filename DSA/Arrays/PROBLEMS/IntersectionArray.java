import java.util.ArrayList;
import java.util.Scanner;

public class IntersectionArray {
    public static void optimal(int[]a,int []b,int n,int m){
        int i=0;
        int j=0;
        ArrayList<Integer> li=new ArrayList<>();
        while (i<n && j<m) {
            if(a[i]==b[j]){
                li.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j]){
                i++;
            }
            else{
                j++;
            }
        }
        System.out.println(li);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        System.out.println("enter array2 size ");
        int m=sc.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[m];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }

        optimal(arr, arr1, n, m);

    }
    
}
