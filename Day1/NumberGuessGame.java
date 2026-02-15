import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        int mainNum=(int) (Math.random()*100)+1;
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("enter your guess?");
            int ch=sc.nextInt();
            if(ch==mainNum){
                System.out.println("Correct Answer.\nYou Win!");
                break;
            }
            else if(ch<mainNum){
                System.out.println("Too Low");
            }
            else{
                System.out.println("Too High");
            }
        }
    }
    
}
