package compute;

import model.Roll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ComputeYatzyTest {

    private final ComputeYatzy computeYatzy = new ComputeYatzy();

    @ParameterizedTest(name = "{index} => {0} should score {1}")
    @MethodSource("rolls")
    void computeScore(Roll roll, int expected) {
        int actual = computeYatzy.computeScore(roll);
        assertEquals(expected, actual);
    }

    private static Stream<Arguments> rolls() {
        return Stream.of(
            Arguments.of(new Roll(4, 4, 4, 4, 4), 50),
            Arguments.of(new Roll(6, 6, 6, 6, 6), 50),
            Arguments.of(new Roll(6, 6, 6, 6, 3), 0)
        );
    }
}