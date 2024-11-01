package lotto.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class InputView {
    public String inputMoney() {
        System.out.println("구입금액을 입력해 주세요.");

        return Console.readLine();
    }

    public String inputWinningNumber() {
        System.out.println("\n당첨 번호를 입력해 주세요.");

        return Console.readLine();
    }

    public String inputWinningBonusNumber() {
        System.out.println("보너스 번호를 입력해 주세요.");

        return Console.readLine();
    }
}
