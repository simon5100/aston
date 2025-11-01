package module3.decorator;

public class ProfessionalTaekwondoPractitioner  extends TaekwondoPractitionerDecorator{

    String yopChagiInTandemWithNakopChagi = "Боковой удар с последующим ударом-метелкой";

    public ProfessionalTaekwondoPractitioner(TaekwondoPractitioner taekwondoPractitioner) {
        super(taekwondoPractitioner);
    }

    @Override
    public String showСombination() {
        return super.showСombination() + " => " + yopChagiInTandemWithNakopChagi;
    }
}