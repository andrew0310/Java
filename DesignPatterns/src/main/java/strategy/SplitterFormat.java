package strategy;

public class SplitterFormat implements FormatterFont {

    public String format(String textToFormat) {

        //abc
/*
        byte[] arraytext = textToFormat.getBytes();  //32 spacja
        byte[] result = new byte[2 * arraytext.length];
        for (int i = 0; i < arraytext.length; i++) {
            if (arraytext[i] != 32) {
                result[2 * i] = arraytext[i];
                result[2 * i + 1] = 32;
            }
        }*/


        //trzeba podzielić Stringa na znaki

        return String.join(" ", textToFormat);
    }
}
