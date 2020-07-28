package Part3.Lesson5;

public abstract class KeywordAnalyzer implements TextAnalyzer {
    protected abstract String[] getKeywords();
    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        Label label = Label.OK;
        for (String keyword : getKeywords())
            if (text.contains(keyword))
                label = getLabel();
        return label;
    }
}
