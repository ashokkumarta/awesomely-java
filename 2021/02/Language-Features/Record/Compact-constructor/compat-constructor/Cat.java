record Cat(String color) {
    Cat {
        if (color.matches("*\\d*")) {
            throw new IllegalArgumentException("Invalid color");
        }
    }
}