package compute;

import model.Roll;
import model.ScoreCategory;

import java.util.Arrays;

public class ComputeSmallStraight implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        int[] expected = new int[]{1, 2, 3, 4, 5};
        int[] diceArray = Arrays.stream(roll.dice())
            .sorted()
            .toArray();

        return Arrays.compare(expected, diceArray) == 0 ? 15 : 0;
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.SMALL_STRAIGHT;
    }
}
