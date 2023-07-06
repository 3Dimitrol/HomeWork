package сontrol_work;

import java.util.List;

public interface IPizzeria {

    Menu getMenu();
    Ticket placeOrder(List<Pizza> pizzas);
    Order getOrder(Ticket ticket);
}
