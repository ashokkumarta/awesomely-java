public class Main {

    public static void main(String[] args) {

        String poemTextBlock = """
                 And miles to go before I sleep.
                 """;
 
        System.out.println("Comparing with \\n:" + "And miles to go before I sleep.\n".equals(poemTextBlock));
        System.out.println("Comparing with \\r\\n:" + "And miles to go before I sleep.\r\n".equals(poemTextBlock));
    }
}