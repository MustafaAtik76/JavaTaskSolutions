package Tasks.Old;

import java.util.ArrayList;

public class Task5 {

    public static void main(String[] args) {


        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        for (String each : arr1) {
            list.add(each);
        }
        for (String each : arr2) {
            list.add(each);


        }
    }
}

/*4. write a program that can combine two String arrays into one arrayList
        ex:

        list ==> {"A", "B", "C", "D", "E", "F", "G"}*/

