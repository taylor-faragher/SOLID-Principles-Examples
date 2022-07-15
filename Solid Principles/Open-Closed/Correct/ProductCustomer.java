import java.util.Random;

public class ProductCustomer implements CustomerProfile{

    public boolean isVipCustomer() {
        return new Random().nextBoolean();
    }
}