package Tasks.day35;

public class Items {

    private String name;
    private double unitPrice;
    private int quantity;

    public Items(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {

        for (int i = 0; i < name.length(); i++) {
            if (!Character.isLetterOrDigit(name.charAt(i))) {
                if (name.charAt(i) == ' ') {
                    continue;
                }
                System.out.println("Invalid name");
                System.exit(0);
            } else if (!Character.isLetter(name.charAt(0))) {
                System.out.println("Invalid name");
                System.exit(0);

            }

        }

        if (name.equals("") || name.equals(" ")) {
            System.out.println("Invalid name");
            System.exit(0);
        } else {
            this.name = name;

        }
    }

    public void setUnitPrice(double unitPrice) {
        if(unitPrice <0){
            System.out.println("Invalid Price");
            return;
        }
        this.unitPrice = unitPrice;
    }


    public void setQuantity(int quantity) {
        if (name.equalsIgnoreCase("Toilet Paper") && quantity > 1 ){
            System.out.println("Invalid Quantity");
            return;
        }
        if(quantity <= 0){
            System.out.println("Invalid Quantity");
            return;
        }
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice * quantity;

    }


    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Cost=" + calcCost() +
                '}';
    }

    public static void main(String[] args) {

        Items items = new Items(" bardak", 10.5, 3);

        System.out.println(items);
    }
}

/*
            	Encapsulate all the fields:
            		Conditions:
            			name can not be empty or blank
            			name can not contain any special characters other than space
            			name must start with letters
            			unit price can not be negative
            			quantity can not be negative
            			if the Item name is toilet paper (case insensitive) then the quantity can not be more than 1


            Add a constructor that allows user to set all the fields when the object is created.
						(If the arguments not valid it should not be set to the instances)

            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()*/
