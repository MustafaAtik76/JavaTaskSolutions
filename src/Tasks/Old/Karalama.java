package Tasks.Old;

import java.util.Scanner;

public class Karalama {


    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        System.out.print("Please enter a word: ");
        String oword = kb.nextLine();
        String word = oword.toUpperCase();
        int length = word.length();

        StringBuilder sb = new StringBuilder();
        // start from the end of the input string
        int i = length - 1;
        while (i >= 0) {
            // add the "next" character to the output
            sb.append(word.charAt(i));
            // step 1 character back
            i--;
        }
        System.out.println(sb.toString());
    }

    }