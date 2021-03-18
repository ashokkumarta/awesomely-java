public class Main {
    
    static final int LOOP_COUNT = 10 * 10; //100

    public static void main(String[] args) {

        for (int i = 0; i < LOOP_COUNT; i++) {
            calculate();
        }
    }
    
    static void calculate() {
        double value = Math.random() * Math.random();
    }
}
