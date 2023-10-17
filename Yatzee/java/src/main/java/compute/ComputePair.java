package compute;

import compute.helper.ComputeHelper;
import model.Roll;
import model.ScoreCategory;

public class ComputePair implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        return ComputeHelper.xOfAKind(roll, 2);
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.PAIR;
    }
}
