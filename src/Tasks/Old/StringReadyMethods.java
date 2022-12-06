package Tasks.Old;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Locale;

public class StringReadyMethods {

    public static void main(String[] args) {
        String deneme = "  kim KiME kimde";

        System.out.println(deneme.length());
        System.out.println(deneme.substring(4));
        System.out.println(deneme.endsWith("de"));
        System.out.println(deneme.substring(4, 10));
        System.out.println(Arrays.toString(deneme.getBytes(StandardCharsets.UTF_8)));
        System.out.println(Arrays.toString(deneme.getBytes()));
        System.out.println(Arrays.toString(deneme.getBytes()));
        System.out.println(deneme.toLowerCase(Locale.ROOT));
        System.out.println(deneme.toUpperCase());
        System.out.println(deneme.equals("yalan"));
        System.out.println(deneme.contains("kim"));
        System.out.println(deneme.isBlank());
        System.out.println(deneme.isEmpty());
        System.out.println(deneme.repeat(3) + " ");
        System.out.println(deneme.lastIndexOf("kim"));
        System.out.println(Arrays.toString(deneme.split(" ")));
        System.out.println(deneme.trim());
        System.out.println(deneme.hashCode());
        System.out.println(deneme.replace('i', 'O'));
        System.out.println(deneme);
        System.out.printf("sana", deneme);
        System.out.println(deneme.toCharArray());
        System.out.println(deneme.replaceAll("m", "r"));
        System.out.println(deneme.substring(4, 9));
        System.out.println(deneme.lines());

      /*  Scanner scanner = new Scanner(System.in);
        System.out.println("veri gir");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int area= a*b;

        System.out.println("Area : "+ area); */

        char c = 'A';

        System.out.println(c + " " + (char) (c + 1) + " " + (char) (c + 2));

        int d = 5;

        double e = 24.5;

        int result = (int) e / d;
        System.out.println(result);
        System.out.println("------------------------------");

        int a11 = 9999;
        int b11 = a11 % 10;
        int c11 = a11 % 10;
        int d11 = a11 % 10;
        int e11 = a11 % 10;

        int result1 = b11 + c11 + d11 + e11;

        System.out.println(result1);

        System.out.println("----------------------------");

        int[] array = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));

        System.out.println(array.length);

        System.out.println(array[3]); // 3. indexteki eleman
        int res = 0;
        for (int i = 0; i < array.length; i++) {

            array [i]+=2;

            System.out.print(array[i] + " ");  // array ın tüm elemanlarını yazdırmak için fori

            System.out.println(res);


        }


        }
    }

