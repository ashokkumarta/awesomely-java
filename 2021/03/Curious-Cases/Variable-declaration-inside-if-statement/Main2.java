public class Main2 {

    public static void main(String[] args) {

        boolean flag = true;
        
        if(flag)
            String message = "I will not compile";
        
        for(; flag ;)
            String message = "I will not compile";
            
        while(flag)
            String message = "I will not compile";
    }
}
