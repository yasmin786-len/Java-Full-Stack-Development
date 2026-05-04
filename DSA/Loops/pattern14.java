import java.util.Scanner;

public class pattern14 {
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    for(int i=1;i<=2*n;i++){
        if(i<=n){
        for(int j=1;j<=(n-i+1);j++){
            System.out.print("*");
        }
        for(int s=0;s<2*(i-1);s++){
            System.out.print(" ");
        }
        for(int j=1;j<=(n-i+1);j++){
            System.out.print("*");
        }

    }
    else{

        for(int j=1;j<=(i-n);j++){
           System.out.print("*");
        }

        for(int s=0;s<((2*n)-2*(i-n));s++){
            System.out.print(" ");
        }

        for(int j=1;j<=(i-n);j++){
           System.out.print("*");
        }

    }
        System.out.println();
    }
    
}
}
