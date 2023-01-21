package solid.isp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TerminalPaymentService implements PayableCreditCart, PayableWebMoney {

    @Override
    public void payWebMoney(int amount) {
        System.out.printf("Terminal pay by web money %d\n", amount);
    }

    @Override
    public void payCreditCard(int amount) {
        System.out.printf("Terminal pay by credit card %d\n", amount);
    }

}
