package animal;

import edible.Edible;

import java.security.spec.ECField;

public class Chicken extends  Animal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
