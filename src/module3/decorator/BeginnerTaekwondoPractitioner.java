package module3.decorator;

public class BeginnerTaekwondoPractitioner  implements TaekwondoPractitioner{

    String apChagi = "Удар ногой вперед";

    @Override
    public String showСombination() {
        return apChagi;
    }
}