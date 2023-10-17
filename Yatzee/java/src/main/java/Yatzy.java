import compute.registry.ComputeStrategyRegistry;
import model.Roll;
import model.ScoreCategory;


public class Yatzy {

    private final ComputeStrategyRegistry registry = new ComputeStrategyRegistry();

    public int computeScore(Roll roll, ScoreCategory category) {
        return registry.getComputeStrategyFor(category)
            .computeScore(roll);
    }
}
