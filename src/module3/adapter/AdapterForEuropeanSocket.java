package module3.adapter;

public class AdapterForEuropeanSocket extends AmericanPlugImpl implements EuropeanPlug {

    public AdapterForEuropeanSocket() {
        System.out.println("Подключено в переходник");
    }
}
