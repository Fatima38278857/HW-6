package Proekt;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);

        Driver pickupDriver = context.getBean("pickupDriver", Driver.class);
        Driver carDriver = context.getBean("carDriver", Driver.class);
        Driver busDriver = context.getBean("busDriver", Driver.class);

        context.close();

        System.out.println(busDriver);
        System.out.println(carDriver);
        System.out.println(pickupDriver);
    }
}



