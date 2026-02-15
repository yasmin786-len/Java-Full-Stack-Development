import java.util.Scanner;
class A{
    int a=23;
}
public class Operators 
{
    public static void main(String[] args) {
        //Arithmetic operators
        System.out.println("Arithmetic operators");
        int a=12;
        int b=23;
        System.out.println("Addition: "+(a+b));
        System.out.println("Subtraction: "+(b-a));
        System.out.println("Multiplication: "+(a*b));
        System.out.println("Division: "+(b/a));
        System.out.println("Modulo: "+(a%b));

        System.out.println("Comparition Operators/Relational Operators");

        System.out.println("a>b? :"+ (a>b));
        System.out.println("a<b? :"+ (a<b));
        System.out.println("a==b? :"+ (a==b));
        System.out.println("a!=b? :"+ (a!=b));
        System.out.println("a<=b? :"+ (a<=b));
        System.out.println("a>=b? :"+ (a>=b));

        System.out.println("Unary Operator");
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);
        System.out.println(a--);
        System.out.println(a);
        System.out.println(--a);
        System.out.println(a);

        System.out.println("Logical operators");

        System.out.println(a<b && a!=b);
        System.out.println(a<b || a!=b);
        System.out.println(!true);

        System.out.println("Assignment Operators");
        int n=34;
        n+=2; //n=n+2;
        System.out.println(n);
        n-=2; //n=n-2;
        System.out.println(n);
        n*=2; //n=n*2;
        System.out.println(n);
        n/=2; //n=n/2;
        System.out.println(n);
        n%=2; //n=n%2;
        System.out.println(n);
        n=n&2;
        System.out.println(n);
        n|=2;
        System.out.println(n);
        n=n | (~2);
        System.out.println(n);

        System.out.println("Bitwise Operators");

        System.out.println(2 & 3);
        System.out.println(2 | 3);
        System.out.println(~2);
        System.out.println(10<<2);
        System.out.println(10>>2);
        System.out.println(10>>>2);

        //ternary operator
        //short hand if
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        boolean isEligible=age>18?true:false;
        System.out.println(isEligible);


        //instace of operator
        A obj=new A();
        System.out.println(obj instanceof A);
        String st="yasmin";
        System.out.println(st instanceof String);
    }    
}
