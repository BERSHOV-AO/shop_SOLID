import java.util.ArrayList;
import java.util.List;

public class OnlineStore {
    public static final double DISCOUNT_RATE = 0.2;

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Хоббит: нежданное путешествие",
                "Приключенческий фильм в жанре эпического фэнтези 2012 года режиссёра Питера Джексона",
                1500));
        products.add(new Product("Властелин колец: Братство Кольца",
                "Приключенческий фильм, сказания о Средиземье — это хроника Великой войны за Кольцо, войны, " +
                        "длившейся не одну тысячу лет.",
                1300));
        products.add(new Product("Во все тяжкие",
                "Сериал , американская телевизионная криминальная драма, премьерные серии которой " +
                        "транслировались с 20 января 2008 года по 29 сентября 2013 года по кабельному каналу AMC.",
                2000));

        ShoppingCart shoppingCart = new ShoppingCart();

        // Добавляем товары в корзину
        shoppingCart.addProduct(products.get(0));
        shoppingCart.addProduct(products.get(2));

        shoppingCart.showCart();

        // Пример применения принципа SOLID: принцип подстановки Барбары Лисков,
        // использование интерфейса для работы с разными  расчета стоимости заказа
        PricingStrategy pricingStrategy = new SimpleDiscountPricingStrategy(DISCOUNT_RATE);
        double totalPrise = shoppingCart.calculateTotalPrice(pricingStrategy);

        System.out.println("Общая стоимость заказа с учетом скидки: " + totalPrise + " руб.");
    }
}
