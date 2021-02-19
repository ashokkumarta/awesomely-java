import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Cat class. Contains a member of type Kitten
 */
record Cat(Kitten child) implements Serializable {

    public String toString() {
        return "Mother@"+this.hashCode();
    }
}

/**
 * Kitten class. Contains a member of type Cat
 */
class Kitten implements Serializable {

    private Cat mother;

    // Accessor to get mother reference
    public Cat mother() {
        return mother;
    }

    // Setter to set mother of the Kitten
    public void setMother(Cat mother) {
        this.mother = mother;
    }

    
    public String toString() {
        return "Child@"+this.hashCode();
    }

}

public class SerializeTest {
    public static void main(String args[]) throws IOException, FileNotFoundException, ClassNotFoundException {
        
        Kitten child = new Kitten(); // Creating a Kitten object
        Cat mother = new Cat(child); // Creating a Cat object, with Kitten object created as its child
        child.setMother(mother); // Set the Cat object created in the previous step as mother for the Kitten object, thus creating circular reference

        System.out.println("****Before****");
        print(mother); // Print the object tree of the mother

        // Serialize and write the mother object to a file
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("out.obj"));
        os.writeObject(mother);
        os.close();

        // De-serialize and read the mother object from the file
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("out.obj"));
        mother = (Cat) in.readObject();

        System.out.println("****After****");
        print(mother); // Print the object tree of the mother after de-serialization
    }

    // Utility method to print the mother object tree
    public static void print(Cat mother) {
        System.out.println("mother is: " + mother);
        System.out.println("mother.child is: " + mother.child());        
        System.out.println("mother.child.mother is: " + mother.child().mother());
    }
}

/**
Output:
****Before****
mother is: Mother@764977973
mother.child is: Child@764977973
mother.child.mother is: Mother@764977973
****After****
mother is: Mother@1811075214
mother.child is: Child@1811075214
mother.child.mother is: null
 */