public class Main1 {
    
    static final int LOOP_COUNT = 100 * 100; //10K

    public static void main(String[] args) {

        for (int i = 0; i < LOOP_COUNT; i++) {
            calculate();
        }
    }
    
    static void calculate() {
        double value = Math.random() * Math.random();
    }
}