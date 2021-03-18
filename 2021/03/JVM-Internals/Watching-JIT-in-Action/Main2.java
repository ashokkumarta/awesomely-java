public class Main2 {
    
    static final int LOOP_COUNT = 1000 * 1000; //1M

    public static void main(String[] args) {

        for (int i = 0; i < LOOP_COUNT; i++) {
            calculate();
        }
    }

    static void calculate() {
        double value = Math.random() * Math.random();
    }
}
