import java.util.Arrays;
import java.util.Scanner;

class arrays{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        arr[0]=12;
        arr[1]=23;
        arr[2]=45;
        System.out.println(Arrays.toString(arr));

        int a[]={1,2,3,4,5};
        System.out.println(Arrays.toString(a));

        int b[]=new int[]{1,2,3,4};
        System.out.println(Arrays.toString(b));

        int ar[];
        //.out.println(ar);
        ar=new int[10];
        System.out.println(ar);


        for(int i:arr){
            System.out.print(i+" ");
        }

        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }

        //sum of elements in the array

        int sum=0;
        for(int i:ar){
            sum+=i;
        }
        System.out.println("sum of array elements is:"+sum);

        //max and min in the array

        Arrays.sort(ar);
        System.out.println("Minimum is:"+ar[0]+" "+"Maximum is:"+ar[ar.length-1]);

        //other way 

        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]<min){
                min=ar[i];
            }
            if(ar[i]>max){
                max=ar[i];
            }
        }

        System.out.println(min+" "+max);
        for(int i:ar){
            System.out.print(i+" ");
        }

        //2d arrays

        int twod[][]=new int[2][];
        twod[0]=new int[]{1,2,3,4};
        twod[1]=new int[]{3,4,5};
        for(int[] i:twod){
            for(int j:i){
                System.out.print(j+" ");
            }
        }

        int q[][]=new int[2][3];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                q[i][j]=sc.nextInt();
            }
        }
        System.out.println(Arrays.toString(q[0]));

        int w[][]={
            {1,2,3,4},
            {4,5,3,4},
            {1,2,3}
        };
        System.out.println(Arrays.toString(w[0]));

   




    }
}