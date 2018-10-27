package strategy;

public class LowerFormat implements FormatterFont {

    public String format(String textToFormat) {
        return textToFormat.toLowerCase();
    }
}
