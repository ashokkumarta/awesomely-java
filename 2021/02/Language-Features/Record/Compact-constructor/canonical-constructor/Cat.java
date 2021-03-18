record Cat(String color) {
    Cat(String color) {
        if (color.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Invalid color");
        }
        this.color = color;
    }
}