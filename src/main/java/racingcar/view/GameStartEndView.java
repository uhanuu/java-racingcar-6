package racingcar.view;

import racingcar.domain.car.RaceCars;

import static racingcar.constants.GameMessage.ATTEMPT_COUNT_MESSAGE;
import static racingcar.constants.GameMessage.START_MESSAGE;


public class GameStartEndView {

    private static final String WINNING_CAR_NAMES_MESSAGE_FORMAT = "최종 우승자 : %s";

    public void printStartMessage() {
        System.out.println(START_MESSAGE.getMessage());
    }

    public void printAttemptCountMessage() {
        System.out.println(ATTEMPT_COUNT_MESSAGE.getMessage());
    }

    public void printWinningCarNames(RaceCars raceCars) {
        System.out.print(String.format(WINNING_CAR_NAMES_MESSAGE_FORMAT, raceCars.getWinningCarNames()));
    }

}
