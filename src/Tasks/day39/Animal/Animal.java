package Tasks.day39.Animal;

public class Animal {

    private String name, breed, size, color;
    private char gender;
    private int age;

    public Animal(String name, String breed, String size, String color, char gender, int age) {
        setName(name);
        setBreed(breed);
        setSize(size);
        setColor(color);
        setGender(gender);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if (name == null || name.equals("") || name.equals(" ")){
            System.out.println("Invalid value");
            return;
        }
        this.name = name;
    }

    public void setBreed(String breed) {
        if (breed == null || breed.equals("") || breed.equals(" ")){
            System.err.println("Invalid value");
            return;
        }
        this.breed = breed;
    }

    public void setSize(String size) {
        if (size == null || size.equals("") || size.equals(" ")){
            System.out.println("Invalid value");
            return;
        }
        this.size = size;
    }

    public void setColor(String color) {
        if (color == null || color.equals("") || color.equals(" ")){
            System.out.println("Invalid value");
            return;
        }
        this.color = color;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.out.println("Invalid value");
            return;
        }
        this.gender = gender;

    }
    public void setAge(int age) {
        if (age<=0){
            System.out.println("Invalid value");
            return;
        }
        this.age = age;
    }
    public void eat(){
        System.out.println(name+ " "+  breed+ " is eating");
    }
    public void drink(){
        System.out.println(name+ " "+  breed+ " is drinking");
    }
    public void sleep(){
        System.out.println(name+ " "+  breed+ " is sleeping");
    }
    public void move(){
        System.out.println(name+ " "+  breed+ " is moving");
    }


    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
/*Animal Task:
	1. Create a class named Animal:
			variables:
				name, breed, gender, age, size, color

			Encapsulate all the fields

			Add a constructor to set all the fields

					Conditions:
						1. name, breed and color can not be null (if obj == null means it's error)
						2. name, breed and color can not be empty or can not be blank
						3. gender should only be set to either 'M' or 'F'
						4. age can not be set to negative

			Methods:
				eat()
				drink()
				sleep()
				move()
				toString()





	5. Create the following sub classes of WildAnimal and Override the hunt method, and add any extra methods that are needed:
				1. Lion
				2. Tiger
				3. Eagle
				4. Bear
				5. Python
				6. Crocodile


	6. Create a class named Zoo:
			Create the objects of each sub classes and

			test all the functions of each objects

            Analyze the relationships between the classes



*/
