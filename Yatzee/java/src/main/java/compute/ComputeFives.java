package compute;

import compute.helper.ComputeHelper;
import model.Roll;
import model.ScoreCategory;

public class ComputeFives implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        return ComputeHelper.countSames(roll, 5);
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.FIVES;
    }
}
