import pizza.Dough;
import pizza.Pizza;
import pizza.Topping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pizza pizza = null;
        try {
            sc.next();
            String name = sc.next();
            int toppingCount = sc.nextInt();
            sc.next();

            pizza = new Pizza(name, toppingCount);
            Dough dough = new Dough(sc.next(), sc.next(), sc.nextDouble());

            pizza.setDough(dough);
            sc.nextLine();

            String input = sc.nextLine();
            while (!input.equals("END")) {
                String[] tokens = input.split(" ");

                Topping topping = new Topping(tokens[1],
                        Double.parseDouble(tokens[2]));
                pizza.addTopping(topping);

                input = sc.nextLine();
            }

            System.out.println(pizza.toString());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
