public class HomePlus extends Insurance {

    @Override
    public double getPremium() {
        this.applyExtraPremium();
        return premium;
    }

    public void applyExtraPremium() {
        premium = premium * 1.5;
    }
}