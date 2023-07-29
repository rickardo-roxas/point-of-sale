/**
 * @author Johan Rickardo Roxas
 * @version 1.00 (29 July 2023)
 */
public class Product {

    /**
     * Reference code of the product with length of 6.
     * 6 alphanumeric characters.
     */
    private String productID;

    /**
     * Name of product.
     */
    private String name;

    /**
     * Number of items being bought.
     */
    private int quantity;

    /**
     * Price per item sold.
     */
    private double price;

    /**
     * Total price of the product (quantity * price).
     */
    private double totalPrice;

    /**
     * Constructs an object of Product with default values.
     */
    public Product() {
        productID = "123ABC";
        name = "Whey Protein";
        quantity = 1;
        price = 2000.00;
        totalPrice = quantity * price;
    } // end of Product default constructor

    /**
     * Constructs an object of Product with user-defined values.
     */
    public Product(String productID, String name, int quantity, double price, double totalPrice) {
        this.productID = productID;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.totalPrice = totalPrice;
    } // end of Product constructor

    /**
     * Mutates the productID value.
     * @param productID alphanumeric characters with length 6.
     */
    public void setProductID(String productID) {
        this.productID = productID;
    } // end of setProductID mutator method

    /**
     * Mutates the name value.
     * @param name specific name of product.
     */
    public void setName(String name) {
        this.name = name;
    } // end of setName mutator method

    /**
     * Mutates the quantity value.
     * @param quantity number of items being purchased
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    } // end of setQuantity mutator method

    /**
     * Mutates the price value.
     * @param price monetary value of each item
     */
    public void setPrice(double price) {
        this.price = price;
    } // end of setPrice mutator method

    /**
     * Mutates the total price value.
     * @param totalPrice total monetary value of all items
     */
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    } // end of setTotalPrice mutator method

    /**
     * Accesses the state of productID.
     * @return 6 alphanumeric characters
     */
    public String getProductID() {
        return productID;
    } // end of getProductID accessor method

    /**
     * Accesses the state of name.
     * @return name of product.
     */
    public String getName() {
        return name;
    } // end of getName accessor method

    /**
     * Accesses the state of quantity.
     * @return quantity of product
     */
    public int getQuantity() {
        return quantity;
    } // end of getQuantity accessor method

    /**
     * Accesses the state of price
     * @return monetary value of item.
     */
    public double getPrice() {
        return price;
    } // end of getPrice accessor method

    /**
     * Accesses the state of total price
     * @return total monetary value of items
     */
    public double getTotalPrice() {
        return totalPrice;
    } // end of getTotalPrice accessor method

    /**
     * Concatenates the attributes of Product.
     * @return comma-separated values of Product attributes.
     */
    public String toString() {
        return productID + "," + name + "," + quantity + "," + price + "," + totalPrice;
    } // end of toString method
} // end of class Product
