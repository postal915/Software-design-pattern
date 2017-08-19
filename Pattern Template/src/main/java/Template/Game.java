package Template;

public abstract class Game {

    abstract void initialize();

    abstract void startGame();

    abstract void endPlay();

    public final void play() {

        initialize();

        startGame();

        endPlay();
    }
}
