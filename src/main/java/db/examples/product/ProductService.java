package db.examples.product;

public class ProductService{
    private ProductDAO productDAO = new ProductDAO();


    public void createNewProduct(Product product) {
        if (product == null) {
            throw new IllegalArgumentException("Product cannot be null");
        }
        if (product.getProductName() == null || product.getProductName().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be null or empty");
        }
        productDAO.createNewProduct(product);
        System.out.println("Creating new product: " + product.getProductName());

    }

    public void getAllProducts() {
        productDAO.getAllProductsFromDatabase();
        System.out.println("Retrieving all products from the database.");
    }
}
