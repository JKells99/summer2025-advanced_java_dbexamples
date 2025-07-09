package db.examples.product;

public class Product {
    private int productId;
    private String productName;
    private String productType;
    private String productDescription;
    private String productLocation;

    public Product(int productId, String productName, String productType, String productDescription, String productLocation) {
        this.productId = productId;
        this.productName = productName;
        this.productType = productType;
        this.productDescription = productDescription;
        this.productLocation = productLocation;
    }

    public Product(String productName, String productType, String productDescription, String productLocation) {
        this.productName = productName;
        this.productType = productType;
        this.productDescription = productDescription;
        this.productLocation = productLocation;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductLocation() {
        return productLocation;
    }

    public void setProductLocation(String productLocation) {
        this.productLocation = productLocation;
    }
}
