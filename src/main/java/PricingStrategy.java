import java.util.List;

public interface PricingStrategy {
   double calculateTotalPrice(List<Product> products);
}
