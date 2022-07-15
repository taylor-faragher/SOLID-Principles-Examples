public class InsuranceCalculator {

    public int calculateInsuranceDiscount(CustomerProfile customer) {
        if (customer.isVipCustomer()) {
            return 50;
        }
        return 0;
    }

    public in calculateInsuranceDiscount(MobileCustomer customer) {
        if (customer.isVipCustomer()) {
            return 50;
        }
        return 0;
    } 
}