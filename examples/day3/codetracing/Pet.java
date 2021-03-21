package examples.day3.codetracing;
import java.util.Math;

public class Pet {
    
    private String type = "mysterious to you";

    public void setAsDog() {
        type = "dog";
    }

    public void setAsCat() {
        type = "cat";
    }

    public void speak() {
        if(type.equals("dog")) {
            System.out.println("Woof!");
        } else if(type.equals("cat")) {
            System.out.println("Meow!");
        } else {
            System.out.println("The animal stares impassively into the distance.");
        }
    }

    public void determineType() {
        if(type.equals("mysterious to you")) {
            
            double r = Math.random();
            if(r >= 0.5) {
                setAsDog();
            } else {
                setAsCat();
            }

        }
    }

    public void observe() {
        System.out.println("The animal is " + type);
    }

}
