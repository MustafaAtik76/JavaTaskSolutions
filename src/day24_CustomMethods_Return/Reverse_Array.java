package day24_CustomMethods_Return;

import java.util.Arrays;

public class Reverse_Array {

    public static void main(String[] args) {

        int [] array =  {10, 20, 30, 40};

        System.out.println(Arrays.toString(reverse(array)));
    }

    public static int[] reverse(int[] array){

        int[] result = new int[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            result[j++] = array[i];
        }

        return result;
    }

}
/*
8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}


 */