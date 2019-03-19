package main;

//import main.entity.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

//    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

//    @Bean
//    public CommandLineRunner demo(ProductRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Product("Jack", (double) 8878));
//            repository.save(new Product("Chloe", (double) 8748957));
//            repository.save(new Product("Kim", (double) 743579847));
//            repository.save(new Product("David", (double) 7879879));
//            repository.save(new Product("Michelle", (double) 789789));
//
//            // fetch all customers
//            log.info("Products found with findAll():");
//            log.info("-------------------------------");
//            Iterable<Product> iterable = repository.findAll();
//            iterable.iterator().toString();
//        };
//
//    }


}