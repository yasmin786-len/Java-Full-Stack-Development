import java.util.ArrayList;
import java.util.Scanner;

class Pair{
    int node;
    int weight;
        Pair(int node,int weight){
            this.node=node;
            this.weight=weight;
        }
    }
public class Weightedli {
    
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //no.of vertices
        ArrayList<ArrayList<Pair>> li=new ArrayList<>();
        for(int i=0;i<n;i++){
            li.add(new ArrayList<>());

        }
        li.get(0).add(new Pair(1,5));
        li.get(1).add(new Pair(0,5));

        li.get(0).add(new Pair(2,2));
        li.get(2).add(new Pair(0,2));

        for(int i=0;i<n;i++){
            System.out.print(i + " -> ");
            for(Pair j:li.get(i)){
                System.out.print(j.node+" "+j.weight+ " ");
            }
            System.out.println();
        }
    
    }
    
}
