package Part3.Lesson5;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private final int maxLength;

    public TooLongTextAnalyzer(int maxSize) {
        this.maxLength = maxSize;
    }

    @Override
    public Label processText(String text) {
        Label label = Label.OK;
        if (text.length() > maxLength)
            label = Label.TOO_LONG;
        return label;
    }
}
