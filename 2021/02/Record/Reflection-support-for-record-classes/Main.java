import java.lang.reflect.RecordComponent;

class Dog {
}

record Cat(String color) {
}

record Pair(Cat cat, Dog dog) {
}

class Main {

	public static void main(String[] args) {
		checkRecord(Dog.class);
		checkRecord(Cat.class);
		checkRecord(Pair.class);
	}

	private static void checkRecord(Class classToCheck) {
		System.out.println("\n" + classToCheck.getName() + " is a record class: " + classToCheck.isRecord());
		if (classToCheck.isRecord()) {
			System.out.print("Its components are: ");

			RecordComponent[] rComponents = classToCheck.getRecordComponents();
			for (RecordComponent component : rComponents) {
				System.out.print(component + ", ");
			}
			System.out.println();
		}

	}
}
