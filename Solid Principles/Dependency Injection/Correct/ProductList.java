public class ProductList {
    public void listAllProducts() {

        //uses abstracted factory class now. no longer dependent on DatabaseProductRepository module.
        ProductRepository repository = ProductFactory.create(); 
        repository.getAllProductNames();
        //Do something with product names
    }
}