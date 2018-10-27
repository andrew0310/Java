package strategy;

public class TrimFormat implements FormatterFont {

    public String format(String textToFormat) {
        return textToFormat.trim();
    }
}
