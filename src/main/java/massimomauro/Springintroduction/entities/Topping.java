package massimomauro.Springintroduction.entities;

import lombok.AllArgsConstructor;


public class Topping extends MenuElement{
    public Topping(String name, long calories, double price) {
        super(name, calories, price);
    }
}
