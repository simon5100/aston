package module3.strategy;

public class Password  implements AuthenticationStrategy{

    @Override
    public void authentication(User userPone, User password) {
        if(userPone.getPassword().equals(password.getPassword())) {
            System.out.println("Аутентификация по паролю прошла успешно");
        } else {
            System.out.println("Я не твой, а ты не мой/я");
        }
    }
}
