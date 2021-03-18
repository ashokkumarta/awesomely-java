class TestEpsilonGC {

    static final int ALLOCATION_SIZE = 1024 * 1024; // 1MB
    static final int LOOP_COUNT = 12;  

    public static void main(String[] args) {
        for (int i = 0; i < LOOP_COUNT; i++) {
            System.out.print("Allocating iteration: "+i);
            byte[] array = new byte[ALLOCATION_SIZE];
            System.out.println(" Done");
        }
    }
}

/*
Command Reference:
1. java -verbose:gc -Xmx10M TestEpsilonGC
Runs to completion

2. java -verbose:gc -Xmx10M -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC TestEpsilonGC > test2.log
Throws OutOfMemoryError

*/
