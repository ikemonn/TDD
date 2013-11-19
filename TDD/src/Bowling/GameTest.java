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


    @Test
    public void すべて1ピンの場合() {
    	Game game = new Game();
    	for(int i = 0; i < 20; i++) {
    		game.roll(1);
    	}
    	assertThat(game.score(), is(20));
    }

    @Test
    public void ストライクの場合() {
    	Game game = new Game();
    	game.roll(10);//ストライク
    	game.roll(0);
    	game.roll(3);
    	game.roll(4);//

    	for(int i = 0; i < 17; i++) {
    		game.roll(0);
    	}
    	assertThat(game.score(), is(24));
    }

    @Test
    public void パーフェクトゲームの場合() {
    	Game game = new Game();
    	for(int i = 0; i < 10; i++) {
    		game.roll(10);
    	}
    	assertThat(game.score(), is(300));
    }


}