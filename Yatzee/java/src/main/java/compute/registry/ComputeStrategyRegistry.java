package compute.registry;

import compute.ComputeChance;
import compute.ComputeFives;
import compute.ComputeFourOfAKind;
import compute.ComputeFours;
import compute.ComputeFullHouse;
import compute.ComputeLargeStraight;
import compute.ComputeOnes;
import compute.ComputePair;
import compute.ComputeSixes;
import compute.ComputeSmallStraight;
import compute.ComputeStrategy;
import compute.ComputeThreeOfAKind;
import compute.ComputeThrees;
import compute.ComputeTwoPairs;
import compute.ComputeTwos;
import compute.ComputeYatzy;
import model.ScoreCategory;

import java.util.List;

public class ComputeStrategyRegistry {

    private final List<ComputeStrategy> computeStrategyList = List.of(
        new ComputeChance(),
        new ComputeFives(),
        new ComputeFourOfAKind(),
        new ComputeFours(),
        new ComputeFullHouse(),
        new ComputeLargeStraight(),
        new ComputeOnes(),
        new ComputeSixes(),
        new ComputeSmallStraight(),
        new ComputeThreeOfAKind(),
        new ComputeThrees(),
        new ComputeTwoPairs(),
        new ComputeTwos(),
        new ComputeYatzy(),
        new ComputePair()
    );

    public ComputeStrategy getComputeStrategyFor(ScoreCategory scoreCategory) {
        return computeStrategyList.stream()
            .filter(computeStrategy -> computeStrategy.supportedCategory() == scoreCategory)
            .findAny()
            .orElseThrow(() -> new IllegalArgumentException("No compute strategy found for category " + scoreCategory));
    }
}
