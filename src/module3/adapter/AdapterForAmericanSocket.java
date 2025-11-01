package module3.adapter;

public class AdapterForAmericanSocket implements AmericanPlug{

    EuropeanPlug europeanPlug;

    public AdapterForAmericanSocket(EuropeanPlug europeanPlug) {
        this.europeanPlug = europeanPlug;
        System.out.println("Всталенно в переходник");
    }

    @Override
    public void plugInSocket() {
        europeanPlug.plugInSocket();
    }
}
