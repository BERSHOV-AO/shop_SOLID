import java.util.List;

public class SimpleDiscountPricingStrategy implements PricingStrategy{
    private double discountRate;

    public SimpleDiscountPricingStrategy(double discountRate){
        this.discountRate = discountRate;
    }
    @Override
    public double calculateTotalPrice(List<Product> products) {
        double totalPrise = 0;
        for(Product product : products){
            totalPrise += product.getPrise();
        }
        double discount = totalPrise * discountRate;
        return totalPrise - discount;
    }
}
