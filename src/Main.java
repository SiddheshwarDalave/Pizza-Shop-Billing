public class Main {
    public static void main(String[] args) {
        DeluxePizza dp = new DeluxePizza(false);
        System.out.println(dp.getPrice());
        dp.addTakeaway();
        dp.addExtraCheese();
        dp.addTakeaway();
        System.out.println("Total Price: "+dp.getBill());

        Pizza p = new Pizza(false);
        p.addExtraCheese();
        p.addExtraToppings();
        p.addTakeaway();
        System.out.println("Total Price: "+p.getBill());
    }
}