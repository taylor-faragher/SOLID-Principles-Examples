public interface InsuranceCustomer implements TmpCustomer {
    
    @Override
    public void insurance(){
        //different code here from TmpCustomer
    };

    @Override
    public void support(){
        //unsupported
    };

    @Override
    public void antivirus(){
        //unsupported
    };

    @Override
    public void recoveryService(){
        //unsupported
    };

    @Override
    public void screenRepair(){
        //unsupported
    };

    @Override
    public void giveDiscount(){
        //unsupported
    };
}