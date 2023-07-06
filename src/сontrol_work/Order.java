package сontrol_work;

import java.util.List;

public class Order {
    private List<Pizza> pizzerita;

    public Order(List<Pizza> pizza){
        this.pizzerita = pizza;
    }

    public List<Pizza> getPizzerita() {
        return pizzerita;
    }
}
