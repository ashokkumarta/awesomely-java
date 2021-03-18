//Main1.java

interface Pet {

}

interface Robot {

}

final class RoboDog implements Robot {

}

public class Main {

    public static void check(Robot r) {
        Pet p = (Pet) r;
    }

    public static void main(String[] args) {

        check(new RoboDog()); // Throws ClassCastException at runtime

    }
}