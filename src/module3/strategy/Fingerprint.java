package module3.strategy;

public class Fingerprint implements AuthenticationStrategy {

    @Override
    public void authentication(User userPhone, User fingerprintParameters) {
        if(userPhone.getFingerprintParameters().equals(fingerprintParameters.getFingerprintParameters())) {
            System.out.println("Аутентификация по отпечатку прошла успешно");
        } else {
            System.out.println("Я не твой, а ты не мой/я");
        }
    }
}
