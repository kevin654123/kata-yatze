package compute;

import model.Roll;
import model.ScoreCategory;

public interface ComputeStrategy {

    int computeScore(Roll roll);

    ScoreCategory supportedCategory();
}
