package compute;

import compute.helper.ComputeHelper;
import model.Roll;
import model.ScoreCategory;

public class ComputeSixes implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        return ComputeHelper.countSames(roll, 6);
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.SIXES;
    }
}
