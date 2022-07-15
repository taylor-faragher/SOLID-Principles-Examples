public class ProductList {
    public void listAllProducts() {
        DatabaseProductRepository repository = new DatabaseProductRepository();
        repository.getAllProductNames();
        //Do something with product names
    }
}