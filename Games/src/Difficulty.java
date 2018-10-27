public enum Difficulty {
    EASY(1), MEDIUM(2), HARD(3);

    private int valuesOfLevels;

    public int getValuesOfLevels() {
        return this.valuesOfLevels;
    }

    Difficulty(int valuesOfLevels) {
        this.valuesOfLevels = valuesOfLevels;
    }
}

