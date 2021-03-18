//Main2.java

interface Pet {

}

sealed interface Robot permits RoboDog {

}

final class RoboDog implements Robot {

}

public class Main {

    public static void check(Robot r) {
        Pet p = (Pet) r;
    }

    public static void main(String[] args) {

        check(new RoboDog());

    }
}
