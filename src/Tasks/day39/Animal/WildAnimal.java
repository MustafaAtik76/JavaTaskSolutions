package Tasks.day39.Animal;

public class WildAnimal extends Animal{


    public boolean isWild, isFriendly, isPlayable;

    public WildAnimal(String name, String breed, String size, String color, char gender, int age,
                          boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, gender, age);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }

    public void hunt() {
        System.out.println(getName()+ " "+ getBreed()+ " is hunting");

    }
}

/*3. Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable

				Extra Methods:
					hunt()


	*/

