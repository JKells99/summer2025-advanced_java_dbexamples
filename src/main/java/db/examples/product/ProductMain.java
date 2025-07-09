package db.examples.product;

public class ProductMain {
    public static void main(String[] args) {
        ProductService productService = new ProductService();
        Product newProduct = new Product("Quantum Drive", "Engine", "A high-efficiency engine for interstellar travel", "Sector 9B");

        // Create a new product
        productService.createNewProduct(newProduct);

        // Retrieve all products
        productService.getAllProducts();


    }
}
