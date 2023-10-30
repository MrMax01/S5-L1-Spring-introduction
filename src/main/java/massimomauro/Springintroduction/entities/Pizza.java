package massimomauro.Springintroduction.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



public class Pizza extends MenuElement {

    public Pizza(String name, long calories, double price) {
        super(name, calories, price);
    }


}
