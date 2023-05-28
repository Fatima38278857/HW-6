package Proekt;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class SpringContext {


    @Bean
    public Pickup getPickup(){
        return new Pickup();
    }
     @Bean
    public Car getCar(){
        return new Car();
     }
     @Bean
    public Bus getBus(){
        return new Bus();
     }

     @Bean(name = "pickupDriver")
    public Driver getPickupDriver(){
        return new Driver(getPickup());
     }
     @Bean(name = "carDriver")
    public Driver getCarDriver(){
        return new Driver(getCar());
    }
    @Bean(name = "busDriver")
    public Driver getBusDriver(){
        return new Driver(getBus());
    }
}
