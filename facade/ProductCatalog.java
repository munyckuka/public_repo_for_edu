package facade;

// 4 subsystems are here
class ProductCatalog {
    public boolean searchProduct(String productName) {
        System.out.println("Searching for product: " + productName);
        // product is always available
        return true;
    }

    public void selectProduct(String productName) {
        System.out.println("Product selected: " + productName);
    }
}

class PaymentProcessor {
    public boolean processPayment(String account, double amount) {
        System.out.println("Processing payment of $" + amount + " for account: " + account);
        // assume payment is always successful
        return true;
    }
}

class InventoryManager {
    public boolean checkStock(String productName) {
        System.out.println("Checking stock for: " + productName);
        // assume stock is available
        return true;
    }

    public void updateInventory(String productName) {
        System.out.println("Inventory updated for product: " + productName);
    }
}

class ShippingService {
    public double calculateShipping(String address) {
        System.out.println("Calculating shipping charges for address: " + address);
        // assume a fixed shipping charge
        return 5.99;
    }

    public void shipOrder(String productName, String address) {
        System.out.println("Shipping " + productName + " to " + address);
    }
}
