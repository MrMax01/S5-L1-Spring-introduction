package massimomauro.Springintroduction.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public abstract class MenuElement {
    private  String name;
    private  long calories;
    private  double price;

    public MenuElement(String name, long calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }


}
