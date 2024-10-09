package facade;

public class userShopping {
    public static void main(String[] args) {
        ShoppingFacade shoppingFacade = new ShoppingFacade();

        String productName = "bread";
        String account = "user";
        String address = "123 Main St, Springfield";

        shoppingFacade.placeOrder(productName, account, address);
    }
}
