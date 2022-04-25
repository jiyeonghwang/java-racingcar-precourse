package racingcar.view;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    private static final String CAR_NAME_REQUEST = "경주 할 자동차 이름(이름은 쉼표(,) 기준으로 구분)";

    public static String printCarNameRequest() {
        System.out.println(CAR_NAME_REQUEST);
        return readLine();
    }
}
