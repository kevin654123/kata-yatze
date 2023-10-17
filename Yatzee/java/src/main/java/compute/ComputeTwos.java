package compute;

import compute.helper.ComputeHelper;
import model.Roll;
import model.ScoreCategory;

public class ComputeTwos implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        return ComputeHelper.countSames(roll, 2);
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.TWOS;
    }
}
