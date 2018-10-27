package strategy;

public class UpperFormat implements FormatterFont {

    public String format(String textToFormat) {
        return textToFormat.toUpperCase();
    }
}
