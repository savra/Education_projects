package Part3.Lesson5;

public class SpamAnalyzer extends KeywordAnalyzer {
    private final Label label = Label.SPAM;
    private final String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }

    @Override
    protected String[] getKeywords() {
        return keywords;
    }

    @Override
    protected Label getLabel() {
        return label;
    }
}
