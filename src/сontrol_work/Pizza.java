package сontrol_work;

import java.util.List;

public class Pizza {
    private String name;
    private List<String> ingredients;

    public Pizza(String name, List<String> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }
    public String getName() {
        return name;
    }
    public List<String> getIngredients() {
        return ingredients;
    }
}
