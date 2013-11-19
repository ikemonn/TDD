package Bowling;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Test;

public class GameTest {

    @Test
    public void すべてガターの場合() {
        Game game = new Game();
        for(int i = 0; i < 20; i++) {
            game.roll(0);
        }
        assertThat(game.score(), is(0));
    }

}