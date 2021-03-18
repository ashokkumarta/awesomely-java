public class EscapeSequence {

    public static void main(String[] args) {

        String poemTextBlock = """
                <html>
                    <body>
                        <pre>
                            The woods are lovely, dark and deep,\040\040\040
                            But I have promises to keep,\040\040\040
                            And miles to go before I sleep,\040\040\040
                            And miles to go before I sleep.\040\040\040
                        </pre>
                    </body>
                </html>""";
    
        System.out.println(poemTextBlock);
    }
}