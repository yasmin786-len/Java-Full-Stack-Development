import java.util.Scanner;

public class pattern12{
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int s=0;s<2*(n-i);s++){
            System.out.print(" ");
        }

        for(int j=i;j>=1;j--){
           System.out.print(j);
        }
        System.out.println();
    }
    
}
}
