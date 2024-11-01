package lotto;

import lotto.controller.LottoController;
import lotto.model.InputValidator;
import lotto.model.LottoMachine;
import lotto.view.InputView;
import lotto.view.OutputView;

public class Application {
    public static void main(String[] args) {
        LottoController lottoController = new LottoController(
                new InputView(),
                new OutputView(),
                new InputValidator(),
                new LottoMachine()
        );

        lottoController.run();
    }
}
