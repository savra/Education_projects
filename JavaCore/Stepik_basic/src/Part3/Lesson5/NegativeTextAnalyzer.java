package Part3.Lesson5;

public class NegativeTextAnalyzer extends KeywordAnalyzer {
    private final Label label = Label.NEGATIVE_TEXT;
    private final String[] keywords;

    public NegativeTextAnalyzer() {
        this.keywords = ":( =( :|".split(" ");
    }

    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel() {
        return this.label;
    }
}
