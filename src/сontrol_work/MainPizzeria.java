package сontrol_work;

import java.util.*;

public class MainPizzeria implements IPizzeria{

    private Menu menu;
    private Map<Ticket, Order> ord;

    public MainPizzeria(Menu menu) {
        this.menu = menu;
        this.ord = new HashMap<>();
    }

    @Override
    public Menu getMenu() {
        return menu;
    }

    @Override
    public Ticket placeOrder(List<Pizza> pizzas) {
        Order order = new Order(pizzas);
        int orderNumber = ord.size() + 1;
        Ticket ticket = new Ticket(orderNumber);
        ord.put(ticket, order);
        return ticket;
    }
    @Override
    public Order getOrder(Ticket ticket) {
        return ord.get(ticket);
    }

    public static void main(String[] args) {
        // Сегодня в меню
        List<Pizza> pizzza = new ArrayList<>();
        pizzza.add(new Pizza("Маргарита", Arrays.asList("Томатный соус", "Моцарелла", "Итальянские травы")));
        pizzza.add(new Pizza("Пеперони", Arrays.asList("Томатный соус", "Моцарелла", "Итальянские травы", "Пекантные колбаски", "Солями")));
        pizzza.add(new Pizza("Гавайская", Arrays.asList("Томатный соус", "Моцарелла", "Итальянские травы", "Курица", "Ананас")));
        pizzza.add(new Pizza("Острая", Arrays.asList("Томатный соус", "Моцарелла", "Итальянские травы", "Говядина", "Перец")));
        Menu menu = new Menu(pizzza);
        // Меню в пиццерии
        IPizzeria pizzeria = new MainPizzeria(menu);
        Menu pizzeriaMenu = pizzeria.getMenu();

        System.out.println("Меню");
        for (Pizza pizza : pizzeriaMenu.getPizzeroni()){
            System.out.println(pizza.getName() + ": " + pizza.getIngredients());
        }
        // Оформление заказа
        List<Pizza> orderPizzas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите номер пиццы, которую вы желаете : ");
        int pizzaNumber = scanner.nextInt() - 1;
        orderPizzas.add(pizzeriaMenu.getPizzeroni().get(pizzaNumber));
        Ticket ticket = pizzeria.placeOrder(orderPizzas);
        System.out.println("Спасибо что выбрали нас.\nНомер заказа : " + ticket.getOrderNumber() + "\nЗаказ принят : " + ticket.getTime());

        System.out.print("Укажите номер пиццы, которую вы желаете : ");
        int pizzaNumber2 = scanner.nextInt() - 1;
        orderPizzas.add(pizzeriaMenu.getPizzeroni().get(pizzaNumber2));
        Ticket ticket2 = pizzeria.placeOrder(orderPizzas);
        System.out.println("Спасибо что выбрали нас.\nНомер заказа : " + ticket2.getOrderNumber() + "\nЗаказ принят : " + ticket2.getTime());

        System.out.print("Укажите номер пиццы, которую вы желаете : ");
        int pizzaNumber3 = scanner.nextInt() - 1;
        orderPizzas.add(pizzeriaMenu.getPizzeroni().get(pizzaNumber3));
        Ticket ticket3 = pizzeria.placeOrder(orderPizzas);
        System.out.println("Спасибо что выбрали нас.\nНомер заказа : " + ticket3.getOrderNumber() + "\nЗаказ принят : " + ticket3.getTime());

        System.out.print("Укажите номер пиццы, которую вы желаете : ");
        int pizzaNumber4 = scanner.nextInt() - 1;
        orderPizzas.add(pizzeriaMenu.getPizzeroni().get(pizzaNumber4));
        Ticket ticket4 = pizzeria.placeOrder(orderPizzas);
        System.out.println("Спасибо что выбрали нас.\nНомер заказа : " + ticket4.getOrderNumber() + "\nЗаказ принят : " + ticket4.getTime());

        Order order = pizzeria.getOrder(ticket);
            System.out.println("Готовы к выдаче : " );
            for (Pizza pizza : order.getPizzerita()){
                System.out.println(pizza.getName() + ": " + pizza.getIngredients());
            }
    }
}
