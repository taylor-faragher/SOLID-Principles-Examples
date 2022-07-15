public class AsurionCustomer {
    private String customerId;
    private String customerName;
    private String customerAddress;
    private String contactNumber;
    private String insuranceType;

    public void saveCustomerInfo() {
        try {
            //code for saving customer to database
        } catch (Exception e) {
            //error code
        }
    }

    public void calculateDiscount() {
        if (this.getInsuranceType().equals("regular")) {
            //calculate discount
        }
        if (this.getInsuranceType().equals("vip")) {
            //calculate discount
        }
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