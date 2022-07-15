public class InsuranceCalculator {

    public int calculateInsuranceDiscount(CustomerProfile customer) {
        if (customer.isVipCustomer()) {
            return 50;
        }
        return 0;
    }
    
    
}