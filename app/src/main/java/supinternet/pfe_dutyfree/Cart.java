package supinternet.pfe_dutyfree;

/**
 * Created by user on 01/12/2016.
 */

public class Cart {
    private String productName;
    private String price;
    private int quantity;
    private String originalPrice;

    public Cart(String productName, String price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.originalPrice = price;
        this.quantity = quantity;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return this.price;
    }

    public String getOriginalPrice() {
        return this.originalPrice;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
