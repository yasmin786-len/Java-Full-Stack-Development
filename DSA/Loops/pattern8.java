import java.util.Scanner;

public class pattern8{
    public static void main(String[] args) {
        
    

    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    for(int i=1;i<=n;i++){
        int s=0;
        for( s=0;s<(i-1);s++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*n-i-s);j++){
            System.out.print("*");
        }
        System.out.println();
    }
    
}
}
