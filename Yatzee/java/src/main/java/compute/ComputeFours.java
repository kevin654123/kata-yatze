package compute;

import compute.helper.ComputeHelper;
import model.Roll;
import model.ScoreCategory;

public class ComputeFours implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        return ComputeHelper.countSames(roll, 4);
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.FOURS;
    }
}
