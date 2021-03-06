interface Pet {
    default public String color() {
        return this.color();
    }
}

record Dog(String color) implements Pet {

    public void bark() {
        System.out.println("I bark...");
    }
}

record Cat(String color) implements Pet {

    public void meaw() {
        System.out.println("I meaw...");
    }
}

public class Main {

    public static void main(String[] args) {

        Pet p1 = new Dog("White");
        Pet p2 = new Cat("White");

        // Without using binding variable
        if (p1 instanceof Dog) {
            Dog d = (Dog) p1;
            d.bark();
        }

        // With binding variable
        if (p2 instanceof Cat c) {
            c.meaw();
        }
        
    }
}