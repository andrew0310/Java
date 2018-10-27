package TAX;

public enum Tax {
    VAT8(8),
    VAT23(23),
    VAT5(5),
    NO_VAT(0);

    Tax(int value) {
        this.value=value;
    }
    private int value;

    @Override
    public String toString() {
        return "Tax{" +
                "value=" + value +
                '}';
    }

    public int getValue() {
        return value;
    }
}

