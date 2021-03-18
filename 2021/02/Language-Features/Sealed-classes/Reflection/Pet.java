import java.lang.constant.ClassDesc;

public sealed interface Pet {
    
}

final class Cat implements Pet {

}

final class Dog implements Pet {
    
}

class Main {
    public static void main(String[] args) {
        System.out.println("Pet is a sealed class: "+Pet.class.isSealed());
        System.out.print("Its supported subtypes are: ");
        ClassDesc[] cDescArr = Pet.class.permittedSubclasses();
        for (ClassDesc cDesc : cDescArr) {
            System.out.print(cDesc.displayName()+" ");
        }
    }
}
