package module3.adapter;

public class EuropeanSocketImpl implements EuropeanSocket{

    EuropeanPlug europeanPlug;

    public EuropeanSocketImpl(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
    }

    @Override
    public void applyCurrent() {
        europeanPlug.plugInSocket();
        System.out.println("Apply current");
    }
}
