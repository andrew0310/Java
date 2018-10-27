public class Bowling {

    private int[] resultRolls;
    private int currentRoll;

    public Bowling() {
        this.currentRoll = 0;
        this.resultRolls = new int[21];
    }


    public void roll(int pins) {
        resultRolls[currentRoll++] = pins;
    }

    public int score() {

        int result = 0;
        int frameIndex = 0;

        for (int i = 0; i < 10; i++) {
            if (isStrike(resultRolls[frameIndex])) {
                result += 10 + resultRolls[frameIndex + 1] + resultRolls[frameIndex + 2];
                frameIndex++;
            } else if (isSpear(frameIndex)) {
                result += 10 + resultRolls[frameIndex + 2];
                frameIndex += 2;
            } else {
                result += resultRolls[frameIndex] + resultRolls[frameIndex + 1];
                frameIndex += 2;
            }
        }
        return result;
    }

    private boolean isSpear(int frameIndex) {
        return resultRolls[frameIndex] + resultRolls[frameIndex + 1] == 10;
    }

    private boolean isStrike(int resultRoll) {
        return resultRoll == 10;
    }
}
