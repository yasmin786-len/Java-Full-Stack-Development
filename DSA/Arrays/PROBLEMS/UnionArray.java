import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class UnionArray {
    public static void bruteforce(int []a,int []b,int n,int m){
        HashSet<Integer> set=new HashSet<>();
        for(int i:a){
            set.add(i);
        }
        for(int i:b){
            set.add(i);
        }
        ArrayList<Integer> li=new ArrayList<>();
        li.addAll(set);
        System.out.println(li);
    }
    public static void optimal(int[]a,int []b,int n,int m){
        int i=0;
        int j=0;
        ArrayList<Integer> li=new ArrayList<>();
        while (i<n && j<m) {
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }
            if (j>0 && b[j]==b[j-1]) {
                j++;
                continue;
            }
            if(a[i]<b[j]){
                li.add(a[i]);
                i++;
            }
            else if(b[j]<a[i]){
                li.add(b[j]);
                j++;
            }
            else{
                li.add(a[i]);
                i++;
                j++;
            }
        }
        while (i<n) {
            if(!li.contains(a[i])){
                li.add(a[i]);
            }
        }
        while (j<m) {
            if(!li.contains(b[j])){
                li.add(b[j]);
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

        bruteforce(arr, arr1, n, m);
        optimal(arr, arr1, n, m);

    }
    
}
