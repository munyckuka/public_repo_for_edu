package facade;

public class ShoppingFacade {
    private ProductCatalog productCatalog;
    private PaymentProcessor paymentProcessor;
    private InventoryManager inventoryManager;
    private ShippingService shippingService;

    public ShoppingFacade() {
        this.productCatalog = new ProductCatalog();
        this.paymentProcessor = new PaymentProcessor();
        this.inventoryManager = new InventoryManager();
        this.shippingService = new ShippingService();
    }
    public void placeOrder(String productName, String account, String address){
//        select product
        if (!productCatalog.searchProduct(productName)){
            return;
        }
        productCatalog.selectProduct(productName);
        System.out.println("Product selected");
//        check inventory
        if (!inventoryManager.checkStock(productName)){
            return;
        }

//        calculate cost
        double shippingCost = shippingService.calculateShipping(address);

//        payment
        double productPrice = 99.99;
        double totalCost = productPrice + shippingCost;
//      if user can pay
        if(!paymentProcessor.processPayment(account, totalCost)){
            return;
        }

//        update inventory
        inventoryManager.updateInventory(productName);
//        ship the product
        shippingService.shipOrder(productName, address);
        System.out.println("Product is on his way");

    }
}
