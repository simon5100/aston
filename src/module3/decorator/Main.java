package module3.decorator;

public class Main {
    public static void main(String[] args) {

        TaekwondoPractitioner taekwondoPractitioner = new ProfessionalTaekwondoPractitioner(new AmateurTaekwondoPractitioner(new BeginnerTaekwondoPractitioner()));

        System.out.println(taekwondoPractitioner.showСombination());
    }
}