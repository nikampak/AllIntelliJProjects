package Repl;

public class StoreProduct {

    public String label, category;
    public int price, stock;
    public boolean hasExpiration;

    public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock){
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }
    public StoreProduct(String label, int price, int stock){
        this.label = label;
        this.price = price;
        category = "misc";
        hasExpiration = false;
        this.stock = stock;
    }
    public StoreProduct(String label, int price){
        this.label = label;
        this.price = price;
        category = "misc";
        hasExpiration = false;
        stock = 0;
    }
    public StoreProduct(String label, int price, String category, boolean hasExpiration){
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        stock = 0;
    }
    public void expired(boolean hasExpired){
        if (hasExpiration && hasExpired)
            stock =0;
    }
    public boolean sale(int quantity){
       if(quantity <= stock) {
           stock -= quantity;
           return true;
       }else{
           return false;
       }
    }
    public double getDiscountedPrice(double discount){
        discount = (discount > 1 ) ? discount / 100 : discount;
        return price * (1-discount);
    }
}
