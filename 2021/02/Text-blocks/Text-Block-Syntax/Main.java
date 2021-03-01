public class Main {

    public static void main(String[] args) {
        
        String poemTextBlock = """
                The woods are lovely, dark and deep,   
                But I have promises to keep,   
                And miles to go before I sleep,   
                And miles to go before I sleep.
                """;
        
        String poemString = "The woods are lovely, dark and deep,\n"
                + "But I have promises to keep,\n"
                + "And miles to go before I sleep,\n"
                + "And miles to go before I sleep.";
        
        System.out.println("Text Block: "+poemTextBlock);
        System.out.println("String: "+poemString);
        
        if (poemString.equals(poemTextBlock)) {
            System.out.println("Textblock and String are equal");
        } else {
            System.out.println("Textblock and String are NOT equal");
        }

    }
}