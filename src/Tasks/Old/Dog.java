package Tasks.Old;

public class Dog {

    public String breed, size, color;
    public int age;
    public char gender;

    public static int numberOfLegs, numberOfWings, numberOfEyes;
    public static boolean isFriendly;


    public Dog(String breed, String size, String color, int age, char gender) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
        this.gender = gender;
    }

    static {

        numberOfLegs = 4;
        numberOfWings = 0;
        numberOfEyes = 2;
        isFriendly = true;

    }

    public void eat(){
        System.out.println(breed + " is eating");
    }
    public void sleep(){
        System.out.println(breed + " is sleeping");
    }
    public void play(){
        System.out.println(breed + " is playing");
    }

    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
/*. Dog Task:
1. Create a class called Dog
            Attributes:
            instance: breed, size, gender,
age, color
            statics: numberOfLegs,
numberOfEyes, numberOfWings, isFriendly
            Add a constructor to initialized all the
fields (instances)
            Methods:
            eat()
            sleep()
            play()*/