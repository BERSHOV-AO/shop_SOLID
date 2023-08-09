import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products;

    public ShoppingCart(){
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public void showCart(){
        System.out.println("Содержимое корзины");
        for(Product product : products){
            System.out.println("- " + product.getName() + " (" + product.getPrise() + " руб.)");
        }
    }

    public double calculateTotalPrice(PricingStrategy pricingStrategy){
        return pricingStrategy.calculateTotalPrice(products);

    }

}
