package Tasks.day39.Animal;

public class FriendlyAnimal extends Animal {

    public boolean isWild, isFriendly, isPlayable;

    public FriendlyAnimal(String name, String breed, String size, String color, char gender, int age,
                          boolean isWild, boolean isFriendly, boolean isPlayable) {
        super(name, breed, size, color, gender, age);
        this.isWild = isWild;
        this.isFriendly = isFriendly;
        this.isPlayable = isPlayable;
    }


    public void play() {
        System.out.println(getName()+ " " + getBreed()+ " is playing");
    }
    public void pet() {
        System.out.println(getName()+ " " + getBreed()+ " is a pet");
    }


}
/*2. Create a sub class of Animal named FriendlyAnimal:
				Variable:
					isWild
					isFriendly
					isPlayable

				Extra methods:
					play()
					pet()
*/
