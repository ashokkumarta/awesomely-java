class TestEpsilonGC {

    static final int ALLOCATION_SIZE = 1024 * 1024; // 1MB
    static final int LOOP_COUNT = 12;  
    static long start;

    public static void main(String[] args) {
        start();        
        for (int i = 0; i < LOOP_COUNT; i++) {
            System.out.print("Allocating iteration: "+i);
            byte[] array = new byte[ALLOCATION_SIZE];
            System.out.println(" Done");
        }
        end();
    }
    
    static void start() {
        start = System.currentTimeMillis();
}
    
    static void end() {
            System.out.println("Time taken: "+(System.currentTimeMillis() - start)+"ms");
    }
}
/*
Command Reference:
1. java -verbose:gc -Xmx10M -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC -XX:+HeapDumpOnOutOfMemoryError TestEpsilonGC 
Creates .hprof file with heapdump in the current working directory

*/
