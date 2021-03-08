public class Main {

    public static void main(String[] args) {

        String poemTextBlock = """
                The woods are lovely, dark and deep,
                But I have promises to keep,
                And miles to go before I sleep,
                And miles to go before I sleep.
                """;

        String poemTextBlockWithNewLine = """
                The woods are lovely, dark and deep,\n
                But I have promises to keep,\n
                And miles to go before I sleep,\n
                And miles to go before I sleep.
                """;

        System.out.println("Text block: \n"+poemTextBlock);
        System.out.println("Text block with new line: \n"+poemTextBlockWithNewLine);

    }
}