public interface MobileCustomer implements TmpCustomer {
    
    @Override
    public void insurance(){
        //different code here from TmpCustomer
    };

    @Override
    public void support(){
        //different code here from TmpCustomer
    };

    @Override
    public void antivirus(){
        //different code here from TmpCustomer
    };

    @Override
    public void recoveryService(){
        //different code here from TmpCustomer
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