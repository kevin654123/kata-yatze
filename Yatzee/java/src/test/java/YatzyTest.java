import model.Roll;
import model.ScoreCategory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YatzyTest {

    @Test
    void computeScore() {
        Yatzy yatzy = new Yatzy();
        int expected = 15;
        int actual = yatzy.computeScore(new Roll(1, 2, 3, 4, 5), ScoreCategory.CHANCE);

        Assertions.assertEquals(expected, actual);
    }
}
