import java.util.Scanner;

public class AdjMatrix{
    public static void main(String args[]){
        //graph representation
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //no.of vertices
        int graph[][]=new int[n][n];
        //undirected graph
        graph[0][1]=1;
        graph[0][2]=1;
        graph[1][0]=1;
        graph[2][0]=1;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}