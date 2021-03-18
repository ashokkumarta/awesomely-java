public sealed interface Pet {

    final Random random = new Random();
    
    default Pet myLuckyPet() {
        if(random.nextInt(2) == 0) {
            return new Cat();
        }
        return new Dog();
    }
}

final class Cat implements Pet {

}

final class Dog implements Pet {

}