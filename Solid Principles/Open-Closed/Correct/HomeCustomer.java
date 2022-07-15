//BONUS FILE!
import java.util.Random;

//Added additional customer type without having to modify InsuranceDiscountCalculator
public class HomeCustomer implements CustomerProfile{
    public boolean isLoyalCustomer() {
        return new Random().nextBoolean();
    }
}