public class CharacterSubstitution {

    public static void main(String[] args) {

        String poemTextBlock = """
                <html>
                    <body>
                        <pre>
                            The woods are lovely, dark and deep,###
                            But I have promises to keep,###
                            And miles to go before I sleep,###
                            And miles to go before I sleep.###
                        </pre>
                    </body>
                </html>""".replace('#',' ');
    
        System.out.println(poemTextBlock);
    }
}
