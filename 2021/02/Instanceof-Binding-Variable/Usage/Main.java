class WithoutBinding {
    public int getSizeOfString(Object o) {
        if (o instanceof String) {
            String s = (String) o;
            return s.length();
        } else {
            return 1;
        }
    }
}

class WithBinding {
        public int getSizeOfString(Object o) {
        if (o instanceof String s) {
            return s.length();
        } else {
            return 1;
        }
    }
}

public class Main {

    public static void main(String[] args) {

        WithoutBinding test1 = new WithoutBinding();
        WithBinding test2 = new WithBinding();

        test1.getSizeOfString("Hello");
        test2.getSizeOfString("Hello");

    }
}