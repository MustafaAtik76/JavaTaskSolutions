package Tasks.day39.Animal;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog("Karabas", "Kangal", "Big", "White", 'M', 3, false,true,true );

        System.out.println("dog = " + dog);

       dog.eat();

       dog.drink();

       dog.sleep();


    }
}
