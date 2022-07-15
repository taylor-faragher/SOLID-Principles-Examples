public class AsurionCustomer {
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String contactNumber;
    private String insuranceType;

    public void saveCustomerInfo() {
        new AsurionCustomerRepository().saveCustomerInfo(this);
    }

    public void calculateDiscount() {
        new DiscountCalculator().calculateDiscount(this);
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getInsuranceType() {
        return insuraceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuraceType;
    }
}