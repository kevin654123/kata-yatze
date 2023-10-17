package compute;

import compute.helper.ComputeHelper;
import model.Roll;
import model.ScoreCategory;

public class ComputeFourOfAKind implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        return ComputeHelper.xOfAKind(roll, 4);
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.FOUR_OF_A_KIND;
    }
}
