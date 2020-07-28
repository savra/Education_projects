package Part3.Lesson5;

public class TestTextAnalyzer {
    private static final int MAX_SIZE = 10;

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        Label label = Label.OK;
        for (TextAnalyzer textAnalyzer : analyzers) {
            label = textAnalyzer.processText(text);
            switch (label) {
                case OK:
                    continue;
                default:
                    return label;
            }
        }
        return label;
    }

    public static void main(String[] args) {
        TextAnalyzer[] textAnalyzers1 = new TextAnalyzer[]{new SpamAnalyzer("spam1 spam2 spam3".split(" ")), new NegativeTextAnalyzer(), new TooLongTextAnalyzer(MAX_SIZE)};
        TextAnalyzer[] textAnalyzers2 = new TextAnalyzer[]{new SpamAnalyzer("spam1 spam2 spam3".split(" ")), new TooLongTextAnalyzer(MAX_SIZE), new NegativeTextAnalyzer()};
        TextAnalyzer[] textAnalyzers3 = new TextAnalyzer[]{new NegativeTextAnalyzer(), new SpamAnalyzer("spam1 spam2 spam3".split(" ")), new TooLongTextAnalyzer(MAX_SIZE)};
        TextAnalyzer[] textAnalyzers4 = new TextAnalyzer[]{new NegativeTextAnalyzer(), new TooLongTextAnalyzer(MAX_SIZE), new SpamAnalyzer("spam1 spam2 spam3".split(" "))};
        TextAnalyzer[] textAnalyzers5 = new TextAnalyzer[]{new TooLongTextAnalyzer(MAX_SIZE), new NegativeTextAnalyzer(), new SpamAnalyzer("spam1 spam2 spam3".split(" "))};
        TextAnalyzer[] textAnalyzers6 = new TextAnalyzer[]{new TooLongTextAnalyzer(MAX_SIZE), new SpamAnalyzer("spam1 spam2 spam3".split(" ")), new NegativeTextAnalyzer()};

        TestTextAnalyzer testTextAnalyzer = new TestTextAnalyzer();
        System.out.println("Результат первого теста: " + testTextAnalyzer.checkLabels(textAnalyzers1, "hi how are you? spam1, :( Iam fine and what about you???"));
        System.out.println("Результат второго теста: " + testTextAnalyzer.checkLabels(textAnalyzers2, "hi how are you? spam1, :( Iam fine and what about you???"));
        System.out.println("Результат третьего теста: " + testTextAnalyzer.checkLabels(textAnalyzers3, "hi how are you? spam1, :( Iam fine and what about you???"));
        System.out.println("Результат четвертого теста: " + testTextAnalyzer.checkLabels(textAnalyzers4, "hi how are you? spam1, :( Iam fine and what about you???"));
        System.out.println("Результат пятого теста: " + testTextAnalyzer.checkLabels(textAnalyzers5, "hi how are you? spam1, :( Iam fine and what about you???"));
        System.out.println("Результат шестого теста: " + testTextAnalyzer.checkLabels(textAnalyzers6, "hi how are you? spam1, :( Iam fine and what about you???"));

    }
}
