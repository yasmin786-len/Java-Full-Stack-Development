import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(k+++" ");
            }
            System.out.println();
        }

        for(int i=65;i<=n+65;i++){
            for(int j=65;j<=i;j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }

        for(int i=65+n;i>=65;i--){
            for(int j=65;j<=i;j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }

        System.out.println();


        for(int i=65;i<=n+65;i++){
            for(int j=65;j<=i;j++){
                System.out.print((char)i+" ");
            }
            System.out.println();
        }
    }
    
}
