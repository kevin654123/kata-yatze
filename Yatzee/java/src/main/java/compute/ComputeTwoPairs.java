package compute;

import compute.helper.ComputeHelper;
import model.Roll;
import model.ScoreCategory;

import java.util.Arrays;
import java.util.Map;

public class ComputeTwoPairs implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        int[] diceArraySum = ComputeHelper.getEachOccurrence(roll)
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() >= 2)
            .mapToInt(Map.Entry::getKey)
            .toArray();

        return diceArraySum.length == 2 ? Arrays.stream(diceArraySum).map(i -> i * 2).sum() : 0;
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.TWO_PAIRS;
    }
}
