class Loops
{
    public static void main(String[] args) {
        //for loop
        for(int i=0;i<5;i++){
            System.out.println("Yasmin");
        }

        for(int i=0;i<5;++i){
            System.out.println(i);
        }


        //while loop
        int i=1;
        while (i<=5) {
            System.out.println(i+" "+"yasmin");
            i++;
        }

        //do-while

        do{
            System.out.println("yasmin");
        }while(i>6);

        //jump statements
        for(int j=1;j<=5;j++){
            if(j==3) continue; //skips current iteration
            System.out.println(j);
        }

        for(int j=1;j<=5;j++){
            if(j==3) break; //breaks here
            System.out.println(j);
        }

        for(int j=0;j<5;j++){
        one:{
            two:{
                if(j==1) break two;
                if(j==4) break one;
            }
            System.out.println("after two");
        }
        System.out.println("after one");
        }
    }
}