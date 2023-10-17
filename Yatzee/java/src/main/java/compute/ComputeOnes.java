package compute;

import compute.helper.ComputeHelper;
import model.Roll;
import model.ScoreCategory;

public class ComputeOnes implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        return ComputeHelper.countSames(roll, 1);
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.ONES;
    }
}
