package Tasks.Old;

public class task3 {

    public static void main(String[] args) {

        String str = "Wooden Spoon!123";

        String letter = "";
        String digit = "";
        String specialChar = "";

        for (int i = 0; i < str.length(); i++) {

            char each = str.charAt(i);

            if (Character.isLetter(each)){
                letter+=each;
            } else if (Character.isDigit(each)){
                digit+=each;
            }else {
                specialChar+=each;
            }


        }
        System.out.println(letter);
        System.out.println(digit);
        System.out.println(specialChar);


    }
}

/*. Write a program that can retrieve the letters, digits and special characters from the string
        Ex:
        str = "Wooden Spoon!"

        output:
        letters= "WoodenSpoon";
        Digits = "";
        specialChars = " !";
*/
