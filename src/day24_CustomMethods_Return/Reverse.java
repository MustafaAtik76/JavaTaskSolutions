package day24_CustomMethods_Return;

import day21_ForEachLoop.SortingArrayInDescendingOrder;
import day23_CustomMethods_Void.PrintEvenNumbers1To100;

public class Reverse {

    public static void main(String[] args) {
        String str = "Java";

        String result = reverse(str);

        System.out.println(result);

        System.out.println(isPalindrome(str));

    }

    public static String reverse(String str) {
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

         public static boolean isPalindrome(String str){

         return reverse(str).equalsIgnoreCase(str);
    }
}
/*
3. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";

					reverse(str) ==> avaJ
 */