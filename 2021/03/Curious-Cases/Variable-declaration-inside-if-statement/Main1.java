public class Main1 {

    public static void main(String[] args) {

        boolean flag = true;
        
        if(flag)
            String message; // Compilation error here
        
        if(flag) {
            String message; // Allowed
        }

    }
}