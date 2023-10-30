package massimomauro.Springintroduction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class S5L1SpringIntroductionApplication {

	public static void main(String[] args) {

		SpringApplication.run(S5L1SpringIntroductionApplication.class, args);
		configurationClass();
	}
	public static void configurationClass() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S5L1SpringIntroductionApplication.class);

		System.out.println("**********************PIZZA************************");
		System.out.println(ctx.getBean("getPizzas"));
		System.out.println("**********************TOPPINGS************************");
		System.out.println(ctx.getBean("getToppings"));
		System.out.println("**********************DRINKS************************");
		System.out.println(ctx.getBean("getDrinks"));
	}


}
