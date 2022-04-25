package racingcar.view;

public class OutputView {
    private static final String ERROR = "[ERROR]";
    private static final String INPUT_ERROR = "자동차 이름은 5글자 이하로 입력하여 주시기 바랍니다.";

    public static String printInputError() {
        return ERROR + INPUT_ERROR;
    }
}

