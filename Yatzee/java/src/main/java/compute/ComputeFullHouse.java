package compute;

import compute.helper.ComputeHelper;
import model.Roll;
import model.ScoreCategory;

import java.util.Arrays;

public class ComputeFullHouse implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        int[] diceArraySum = ComputeHelper.getEachDiceSum(roll)
            .values()
            .stream()
            .mapToInt(i -> i)
            .toArray();

        return diceArraySum.length == 2 ? Arrays.stream(diceArraySum).sum() : 0;
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.FULL_HOUSE;
    }
}
