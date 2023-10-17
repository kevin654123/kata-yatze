package compute;

import compute.helper.ComputeHelper;
import model.Roll;
import model.ScoreCategory;


public class ComputeChance implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        return ComputeHelper.getSum(roll);
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.CHANCE;
    }
}
