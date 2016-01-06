package hello;

import org.joda.time.LocalTime;

/**
 * Created by netive on 2016. 1. 6..
 */
public class HelloWorld {

    public static void main(String[] args) {
        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());
    }

}
