package massimomauro.Springintroduction;

import massimomauro.Springintroduction.entities.Drink;
import massimomauro.Springintroduction.entities.Pizza;
import massimomauro.Springintroduction.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfiguration {

    @Bean
    List<Pizza> getPizzas() {
        List <Pizza> pizzas = new ArrayList<>();
        pizzas.add(new Pizza("Pizza Margherita", 1104, 4.99));
        pizzas.add(new Pizza("Hawaii Pizza", 1024, 6.49));
        return pizzas;
    }
    @Bean

    List<Topping> getToppings() {
        List <Topping> toppings = new ArrayList<>();
        toppings.add(new Topping("Cheese", 92, 0.69));
        toppings.add(new Topping("Ham", 35, 0.99));
        return toppings;
    }
    @Bean
    List<Drink> getDrinks() {
        List <Drink> drinks = new ArrayList<>();
        drinks.add(new Drink("Lemonade", 128, 1.29));
        drinks.add(new Drink("Water", 0, 1.29));
        drinks.add(new Drink("Wine", 607, 7.49));
        return drinks;
    }

}
