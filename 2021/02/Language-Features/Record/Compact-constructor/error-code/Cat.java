record Cat(String color) {
    Cat {
        if (this.color.matches("*\\d*")) {
            throw new IllegalArgumentException("Invalid color");
        }
    }
}