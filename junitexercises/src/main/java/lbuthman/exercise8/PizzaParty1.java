package lbuthman.exercise8;

import java.util.Scanner;
import static tools.Tools.*;

public class PizzaParty1 {
    public static void main(String[] args) {

        PizzaCalculator pizzaCalculator = new PizzaCalculator();

        Scanner scanner = getScanner();

        print("How many hungry folks you got? ");
        int people = scanner.nextInt();
        pizzaCalculator.setPeople(people);

        print("How many pizzas do you have? ");
        int pizzas = scanner.nextInt();
        pizzaCalculator.setPizzas(pizzas);

        int totalSlices = pizzaCalculator.calculateTotalSlices();

        int slicesPerPerson = pizzaCalculator.calculateSlicesPerPerson();
        int leftOverSlices = totalSlices - (people * slicesPerPerson);

        println("Each person gets " + slicesPerPerson + " slices of pizza.");

        if (leftOverSlices == 1) {
            println("There is one extra slice. Better move fast ...");

        }
        else if (leftOverSlices > 0){
            println("There are " + leftOverSlices + " extra slices. Game on!");

        } else {
            println("Sorry, there are no extra slices. Order some more?");
        }

    }
}
