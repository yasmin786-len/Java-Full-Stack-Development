class A{
    //instance variables
    int a;
    String st;
    A(int a){
        this.a=a;
    }
}
public class Variables
{
    //static variables
    static int age=23;
    static int a;
    static{
         a=89;
    }
    public static void main(String[] args) {
        //variables are the storage containers that will store the values in memory
        int a=12;
        System.out.println(a);
        //string variable
        String st="yasmin";
        System.out.println(st);
        System.out.println(age);

        //double variable
        //initialization
        double d=23.3;
        System.out.println(d);
        //declaration
        int b;
        b=90;
        System.out.println(b);

        //types of variables

        //local variables

        print();
       // System.out.println(s); //error

        A q=new A(12);
        System.out.println(q.a);
        System.out.println(q.st);

    }
    static void print(){
        int s=90;
        System.out.println(s);
        System.out.println(age);
        System.out.println(a);
    }
    
}
