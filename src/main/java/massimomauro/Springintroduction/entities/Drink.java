package massimomauro.Springintroduction.entities;

import lombok.AllArgsConstructor;


public class Drink extends MenuElement{
    public Drink(String name, long calories, double price) {
        super(name, calories, price);
    }

}
