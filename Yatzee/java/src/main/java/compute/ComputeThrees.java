package compute;

import compute.helper.ComputeHelper;
import model.Roll;
import model.ScoreCategory;

public class ComputeThrees implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        return ComputeHelper.countSames(roll, 3);
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.THREES;
    }
}
