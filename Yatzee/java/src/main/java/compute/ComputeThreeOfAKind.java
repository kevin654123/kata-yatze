package compute;

import compute.helper.ComputeHelper;
import model.Roll;
import model.ScoreCategory;

public class ComputeThreeOfAKind implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        return ComputeHelper.xOfAKind(roll, 3);
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.THREE_OF_A_KIND;
    }
}
