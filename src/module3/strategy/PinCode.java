package module3.strategy;

public class PinCode  implements AuthenticationStrategy{

    @Override
    public void authentication(User userPone, User pinCod) {
        if(userPone.getPinCod() == pinCod.getPinCod()){
            System.out.println("Аутентификация по пинкоду прошла успешно");
        } else {
            System.out.println("Я не твой, а ты не мой/я");
        }
    }
}
