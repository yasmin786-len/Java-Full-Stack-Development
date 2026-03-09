import java.util.ArrayList;
import java.util.Scanner;

public class AdjList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //no.of vertices
        ArrayList<ArrayList<Integer>> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(new ArrayList<>());

        }
        li.get(0).add(1);
        li.get(1).add(0);

        li.get(0).add(2);
        li.get(2).add(0);

        for(int i=0;i<n;i++){
            System.out.print(i + " -> ");
            for(int j:li.get(i)){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}
