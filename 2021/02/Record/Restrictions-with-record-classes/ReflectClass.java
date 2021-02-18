
import java.lang.reflect.Modifier;

public class ReflectClass {

    public static void reflect(Class<?> ref) {
        log("Name",ref.getName());
        log("Module",ref.getModule().getName());
        log("PackageName",ref.getPackageName());
        log("Superclass",ref.getSuperclass().getName());
        log("Modifiers",Modifier.toString(ref.getModifiers()));
        log("DeclaredConstructors", ref.getDeclaredConstructors());
        log("DeclaredFields", ref.getDeclaredFields());
        log("DeclaredMethods", ref.getDeclaredMethods());
        
    }

    static void log(String name, Object[] values) {
        log(String.format("****%s****", name));
        int i = 0;
        for (Object val:values) {
            log(name+"-"+i++, val.toString());
        }
    }

    static void log(String name, String value) {
        log(String.format("%-25s: %s", name, value));
    }

    static void log(String data) {
        System.out.println(data);;
    }
    
    public static void main(String args[]) throws ClassNotFoundException {
        reflect(Class.forName(args[0]));
    }

}