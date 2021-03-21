package examples.day3.codetracing;

public class CodeTracing {
    public static void main(String args[]) {

        Pet animal1 = new Pet();
        Pet animal2 = new Pet();

        System.out.println("You see two animals in the distance");

        animal1.observe();
        animal2.observe();

        animal1.speak();

        System.out.println("You approach them to get a closer look");

        animal1.determineType();
        animal2.determineType();

        System.out.println("You see two animals.");

        animal1.observe();
        animal2.observe();

        System.out.println("As you approach, they speak.");

        animal1.speak();
        animal2.speak();

    }
}