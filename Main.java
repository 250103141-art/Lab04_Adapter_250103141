public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pineapple(new Olives(new Cheese(new PlainPizza())));

        System.out.println("Description: " + pizza.getDescription());
        System.out.printf("Total cost: $%.2f%n", pizza.getCost());


        Pizza doubleCheese = new Cheese(new Cheese(new Olives(new PlainPizza())));
        System.out.println("Description: " + doubleCheese.getDescription());
        System.out.printf("Total cost: $%.2f%n", doubleCheese.getCost());
    }
}

