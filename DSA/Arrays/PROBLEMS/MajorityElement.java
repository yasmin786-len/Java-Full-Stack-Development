import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MajorityElement {
    public static int optimal(int []arr,int n){
        int c=0;
        int maxi=0;
        int n1=arr[0];
        for(int i=0;i<n;i++){
            if(c==0){
                c=1;
                n1=arr[i];
            }
            if(arr[i]==n1){
                c++;
                //maxi=Math.max(maxi, c);
            }
            else{
              //  n1=arr[i];
                c--;
            }
        }
        c=0;
        for(int i:arr){
            if(i==n1){
                c++;
            }
        }
        if (c>n/2) {
            return n1;
        }
        return -1;
    }
    public static int bruteforce(int []arr,int n){
        int c=0;
        for(int i=0;i<n;i++){
            int j=arr[i];
            c=0;
            for(int k=0;k<n;k++){
                if (arr[k]==j) {
                    c++;
                }
            }
            if(c>n/2){
                return j;
            }
        }
        return -1;
    }
    public static int better(int []arr,int n){

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for(Entry<Integer, Integer> mp:map.entrySet()){
            if (mp.getValue()>n/2) {
                return mp.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int n=sc.nextInt();
        
        int arr[]=new int[n];
      
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("brute force approach:"+bruteforce(arr, n));
        System.out.println("better approach:"+better(arr, n));
        System.out.println("optimal approach:"+optimal(arr, n));
    }
    
}
