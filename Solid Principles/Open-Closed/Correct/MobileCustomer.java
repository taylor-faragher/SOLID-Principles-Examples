import java.util.Random;

public class MobileCustomer implements CustomerProfile{

    public boolean isVipCustomer() {
        return new Random().nextBoolean();
    }
}