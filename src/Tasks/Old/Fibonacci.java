package Tasks.Old;

public class Fibonacci {

    public static void main(String[] args) {

       fibonacci(8);
    }

    public static void fibonacci (int number){

        int f1 = 0;
        int f2 = 1;
        int result = 1;

        for (int i = 0; i < number; i++) {

            if( i == 0) {
                System.out.print(result+" ");
                continue;
            }
            result=f1+f2;
            System.out.print(result + " ");

            f1 = f2;
            f2 = result;


        }
    }



}
