package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.Game;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;

public class GameController {

    public void play() {
        Game game = readyGame();
        startGame(game);
        endGame();
    }

    public Game readyGame() {
        ArrayList<String> carNames = InputView.inputCarName();
        int gameRound = InputView.inputGameRound();

        return new Game(carNames, gameRound);
    }

    public void startGame(Game game) {
        OutputView.printResult();
    }

    public void endGame(Game game) {
        ArrayList<String> winners = game.findWinner();
        OutputView.printWinners(winners);
    }
}
