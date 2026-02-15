import java.util.Arrays;

class DataTypes
{
    public static void main(String[] args) {
        //There are mainly 8 primitive data types
        System.out.println("Hello World!");
        System.out.println("Welcome to Java Full Stack Development Learning....!");
        boolean isJavaFun=true;
        System.out.println("Is java Fun? "+isJavaFun);
        boolean completedEating=false;
        System.out.println("Is ramesh completed eating? "+completedEating);
        //byte datatypes
        byte age=25;
        System.out.println("Age:"+age);
        byte temperature=-10;
        System.out.println("Temperature:"+temperature);
        //short
        short students=11010;
        short temp=-200;
        System.out.println(students+" "+temp);
        //int
        int population=12323232;
        int distance=2345;
        System.out.println(population+" "+distance);
        //long
        long bigValue=324234342424234l;
        System.out.println(bigValue);
        //float 
        float decimal=23.45f;
        System.out.println(decimal);

        //double
        double d1=34.564;
        double d2=3434.34e10;
        System.out.println(d1+" "+d2);
        //char 
        char ch='e';
        System.out.println(ch);

        //non-primitive datatypes
        //string
        String st="sayyad yasmin";
        System.out.println(st);
        String st1=new String("karim sayyad");

        //class object  interface  array
        //array
        int arr[]={1,2,3};
        System.out.println(Arrays.toString(arr));
        

        
    }
}