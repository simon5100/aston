package module3.decorator;

public class AmateurTaekwondoPractitioner extends TaekwondoPractitionerDecorator{

    String tvioDolloChagi = "Удар ногой с разворота в прыжке";

    public AmateurTaekwondoPractitioner(TaekwondoPractitioner taekwondoPractitioner) {
        super(taekwondoPractitioner);
    }

    @Override
    public String showСombination() {
        return super.showСombination() + " => " + tvioDolloChagi;
    }
}