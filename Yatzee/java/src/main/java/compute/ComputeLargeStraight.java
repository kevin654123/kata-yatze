package compute;

import model.Roll;
import model.ScoreCategory;

import java.util.Arrays;

public class ComputeLargeStraight implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        int[] expected = new int[]{2, 3, 4, 5, 6};
        int[] diceArray = Arrays.stream(roll.dice())
            .sorted()
            .toArray();

        return Arrays.compare(expected, diceArray) == 0 ? 20 : 0;
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.LARGE_STRAIGHT;
    }
}
