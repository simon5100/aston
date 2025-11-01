package module3.adapter;

public class Main {
    public static void main(String[] args) {

        AmericanPlug americanPlug = new AmericanPlugImpl();
        AmericanSocket americanSocket = new AmericanSocketImpl(americanPlug);
        EuropeanPlug europeanPlug = new EuropeanPlugImpl();
        EuropeanSocket europeanSocket = new EuropeanSocketImpl(europeanPlug);

        AdapterForAmericanSocket adapterForAmericanPlug = new AdapterForAmericanSocket(europeanPlug);
        AdapterForEuropeanSocket adapterForEuropeanPlug = new AdapterForEuropeanSocket();
        AmericanSocket americanSocket2 = new AmericanSocketImpl(adapterForAmericanPlug);
        EuropeanSocket europeanSocket2 = new EuropeanSocketImpl(adapterForEuropeanPlug);

        System.out.println("_________________________");
        americanSocket.applyCurrent();
        System.out.println("_________________________");
        europeanSocket.applyCurrent();
        System.out.println("_________________________");
        americanSocket2.applyCurrent();
        System.out.println("_________________________");
        europeanSocket2.applyCurrent();

        //Вывод в консоль
//        Всталенно в переходник
//        Подключено в переходник
//        _________________________
//        Plug In Socket
//        Apply current
//        _________________________
//        Plug In Socket
//        Apply current
//        _________________________
//        Plug In Socket
//        Apply current
//        _________________________
//        Plug In Socket
//        Apply current

    }
}
