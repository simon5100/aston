package module3.decorator;

public class TaekwondoPractitionerDecorator implements TaekwondoPractitioner {

    TaekwondoPractitioner taekwondoPractitioner;

    public TaekwondoPractitionerDecorator(TaekwondoPractitioner taekwondoPractitioner) {
        this.taekwondoPractitioner = taekwondoPractitioner;
    }

    @Override
    public void showСombination() {
        taekwondoPractitioner.showСombination();
    }
}
