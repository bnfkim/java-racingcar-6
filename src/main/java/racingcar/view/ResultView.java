package racingcar.view;

public class ResultView {

    private static final String PLAY_RESULT = "실행 결과";
    private static final String FINAL_WINNER = "최종 우승자 : ";

    public static void printResult() {
        System.out.println(PLAY_RESULT);
    }

    public static void printWinners() {
        System.out.print(FINAL_WINNER);
    }
}
