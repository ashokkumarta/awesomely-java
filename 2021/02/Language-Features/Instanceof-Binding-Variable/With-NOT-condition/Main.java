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
        Sample1 - Compiles and executes as expected
    */
    public static void main(String[] args) {

        Pet p1 = new Dog("White");
        Pet p2 = new Cat("White");

        if (!(p1 instanceof Dog d)) {
            return;
        }
        
        if (!(p2 instanceof Cat c)) {
            return;
        }

        d.bark();
        c.meaw();
    }


    /** 
        Sample2 - Does not compile
    */
    /*
    public static void main(String[] args) {

        Pet p1 = new Dog("White");
        Pet p2 = new Cat("White");

        if (!(p1 instanceof Dog d)) {
            System.out.println("p1 is not Dog");
        }
        
        if (!(p2 instanceof Cat c)) {
            System.out.println("p2 is not Cat");
        }

        d.bark();
        c.meaw();
    }
    */

    /** 
        Sample3 - Compiles and executes
    */
    /*
    public static void main(String[] args) {

        Pet p1 = new Dog("White");
        Pet p2 = new Cat("White");

        if (!(p1 instanceof Dog d)) {
            System.out.println("p1 is not Dog");
        } else {
            d.bark();
        }
        
        if (!(p2 instanceof Cat c)) {
            System.out.println("p2 is not Cat");
        } else {
            c.meaw();
        }
    }
    */

}