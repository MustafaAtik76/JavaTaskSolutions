package Tasks.Old;

public class Task1 {

    public static void main(String[] args) {



        int [] givenArr = {4,9,1,3,6,4};

        for (int i = 1; i < givenArr.length-1; i++) {

            if (leftsum(givenArr, i) == rightsum(givenArr, i)){

                System.out.println(i);
                break;
            }

        }
    }

    public static int leftsum(int[] givenAr, int point) {

        int sum =  0;

        for (int i = 0; i < point; i++) {

            sum += givenAr[i];

        }
        return sum;

    }

   public static int rightsum(int[] givenAr, int point){

        int sum = 0;

        for (int i= point+1; i<givenAr.length; i++){
            sum += givenAr[i];

        }

        return sum;
    }
}
    //Given an array of integers, write a program that prints the index of an item in the array, where the sum of all items on its left is equal to the sum of the ones on the right.

   /* For example :
        Given array => [4, 9, 1, 3, 6, 4]
        //Output:
        your program should print as a result => 2
        because the item at index 2 is 1, and 4+9 = 3+6+4

    */