record Cat(String color) {
    
    // Not allowed - Declaring the instance variable for a record component explicitly
    private final String color; 

    // Not allowed - Declaring an instance variable not listed in the record header
    private final String breed; 

    // Not allowed - Having instance initialization block
    {
        System.out.println("Creating an instance");
    }

    // Not allowed - implementing a native method inside a record
    native void iAmNative();
}