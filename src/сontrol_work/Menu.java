package сontrol_work;

import java.util.List;

public class Menu {
    private List<Pizza> pizzeroni;

    public Menu(List<Pizza> pizzeroni) {
        this.pizzeroni = pizzeroni;
    }
    public List<Pizza> getPizzeroni() {
        return pizzeroni;
    }
}
