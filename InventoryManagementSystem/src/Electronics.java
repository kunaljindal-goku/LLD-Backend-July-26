public class Electronics extends Item {
    private int warranty;

    public Electronics(String id, String name, double price, int quantity, int warranty) {
        super(id, name, quantity, price);
        this.warranty = warranty;
    }

    public int getWarranty() { return warranty; }
    public void setWarranty(int warranty) { this.warranty = warranty; }
}