package day11_practice_tasks;

public class Pizza {
    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniToppig;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniToppig) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniToppig = numberOfPepperoniToppig;
    }
    public int calcCost(){
        int sizePrice = 0;
        if (size.equalsIgnoreCase("Small"))
            sizePrice = 10;
        if (size.equalsIgnoreCase("Medium"))
            sizePrice = 12;
        if (size.equalsIgnoreCase("Large"))
            sizePrice = 14;
        return sizePrice + numberOfCheeseTopping * 2 +numberOfPepperoniToppig * 2;

    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniToppig=" + numberOfPepperoniToppig +
                ",total cost $" + calcCost();

    }
}
/*

1. Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.

 */