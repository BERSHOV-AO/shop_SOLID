import java.util.List;
// Интерфейс для расчета стоимости заказа
public interface PricingStrategy {
   double calculateTotalPrice(List<Product> products);
}
