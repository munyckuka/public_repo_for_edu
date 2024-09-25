
class DiscountCalculator {
    public double calculateDiscount(Product product) {
        return product.getDiscount();
    }
}
interface Product {
    double getDiscount();
}

class FoodProduct implements Product {
    public double price;

    public FoodProduct(double price) {
        this.price = price;
    }
    @Override
    public double getDiscount(){
        return price * 0.1;
    }
}

class ElectronicsProduct implements Product{
    public double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    @Override
    public double getDiscount() {
        return price*0.2;
    }
}

public class Ass1{
    public static void main(String[] args) {
        DiscountCalculator discountCalculator = new DiscountCalculator();

        FoodProduct apple = new FoodProduct(100);
        System.out.println("Discount for apple: " + discountCalculator.calculateDiscount(apple));
    }
}