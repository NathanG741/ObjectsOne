package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Person person1 = new Person("Harry", 30, 180);

        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info(String.valueOf(person1.height));

        person1.height = 200;
        logger.info(String.valueOf(person1.height));

        Car[] cars = new Car[3];
    }
}
