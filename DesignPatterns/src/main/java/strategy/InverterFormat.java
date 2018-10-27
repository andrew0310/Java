package strategy;

public class InverterFormat implements FormatterFont {

    final byte firstASCIILetterSignSmall = 65;
    final byte lastASCIILetterSignSmall = 90;
    final byte firstASCIILetterSignBig = 97;
    final byte lastASCIILetterSignBig = 122;
    final byte displacement = 32;


    public String format(String textToFormat) {
        byte[] textArray = textToFormat.getBytes();
        for (int i = 0; i < textArray.length; i++) {
            if (textArray[i] >= firstASCIILetterSignSmall && textArray[i] <= lastASCIILetterSignSmall) {
                textArray[i] = (byte) (textArray[i] + displacement);
            } else if (textArray[i] >= firstASCIILetterSignBig && textArray[i] <= lastASCIILetterSignBig) {
                textArray[i] = (byte) (textArray[i] - displacement);
            }
        }
        return new String(textArray);
    }
}
