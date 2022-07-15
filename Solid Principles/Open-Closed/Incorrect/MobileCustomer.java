import java.util.Random;

public class MobileCustomer{
    public boolean isVipCustomer() {
        return new Random().nextBoolean();
    }
}