package compute;

import compute.helper.ComputeHelper;
import model.Roll;
import model.ScoreCategory;

public class ComputeYatzy implements ComputeStrategy {

    @Override
    public int computeScore(Roll roll) {
        return ComputeHelper.getEachOccurrence(roll).size() == 1 ? 50 : 0;
    }

    @Override
    public ScoreCategory supportedCategory() {
        return ScoreCategory.YATZY;
    }
}
