public class DatabaseProductRepository implements ProductRepository {
    public List<String> getAllProductNames() {
        return Arrays.asList("TMP", "Mobile", "Insurance");
    }
}