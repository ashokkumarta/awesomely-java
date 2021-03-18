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

    /** 
        Sample1 - does not compile
    */
    /*
    public static void main(String[] args) {

        Pet p1 = new Dog("White");
        Pet p2 = new Cat("White");

        if (p1 instanceof Dog d) {
            d.bark();
        }

        if (p2 instanceof Cat c) {
            c.meaw();
        }

        d.bark(); 
        c.meaw(); // Will not compile. c & d are not visible beyond their respective if blocks
    }
    */

    /** 
        Sample2 - does not compile
    */
    /*
    public static void main(String[] args) {

        Pet p1 = new Dog("White");
        Pet p2 = new Cat("White");

        boolean isDog = p1 instanceof Dog d;
        boolean isCat = p2 instanceof Cat c;

        d.bark();
        c.meaw();

    }
    */

    /** 
        Sample3 - does not compile
    */
    /*
    public static void main(String[] args) {

        Pet p1 = new Dog("White");
        Pet p2 = new Cat("White");

        if (p1 instanceof Dog d & p2 instanceof Cat c) {
            d.bark();
            c.meaw();
        }
    }    
    */

    /** 
        Sample4 - Compiles and executes
    */
    public static void main(String[] args) {

        Pet p1 = new Dog("White");
        Pet p2 = new Cat("White");

        if (p1 instanceof Dog d && p2 instanceof Cat c) {
            d.bark();
            c.meaw();
        }
    }    

}
