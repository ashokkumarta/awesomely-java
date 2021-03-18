//Main.java

interface Pet {

}

interface Robot {



public class Main {
    
    public static void check(Robot r) {
        Pet p = (Pet) r;
    }
    
    public static void main(String[] args) {
        
		check(new Robot() {
		}); // Throws ClassCastException at runtime

		class RoboDog implements Robot, Pet {
		} // Class that implements both Robot and Pet

		check(new RoboDog()); // Valid

    }
}