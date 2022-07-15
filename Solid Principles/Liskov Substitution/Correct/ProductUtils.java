import java.util.ArrayList;

public class ProductUtils {

    public static void main(String[] args) {

        Product phone = new Insurance();
        Product tablet = new Insurance();
        Product television = new HomePlus();

        List<Product> productList = new ArrayList<>();
        productList.add(phone);
        productList.add(tablet);
        productList.add(television);

        for (Product product : productList) {
            //removed if statement evaluating class
            System.out.printLn(product.getPremium());
        }
    }
}