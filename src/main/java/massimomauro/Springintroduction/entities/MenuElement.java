package massimomauro.Springintroduction.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class MenuElement {
    private String name;
    private long calories;
    private long price;
}
