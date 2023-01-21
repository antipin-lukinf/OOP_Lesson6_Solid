package solid;

import solid.srp.models.Input;
import solid.srp.models.Order;
import solid.srp.models.SaveManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");

        Input newOrder = new Input();
        Order order = newOrder.inputFromConsole();
        SaveManager sm = new SaveManager();
        sm.saveToJson(order);

    }
}
