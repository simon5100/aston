package module3.adapter;

public class AmericanSocketImpl implements AmericanSocket{

    AmericanPlug americanPlug;

    public AmericanSocketImpl(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void applyCurrent() {
        americanPlug.plugInSocket();
        System.out.println("Apply current");
    }
}
