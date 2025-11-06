package module3.strategy;

public class Face implements AuthenticationStrategy{

    @Override
    public void authentication(User userPone, User faceParameters) {
        if(userPone.getFaceParameters().equals(faceParameters.getFaceParameters())){
            System.out.println("Аутентификация по лицу прошла успешно");
        } else {
            System.out.println("Я не твой, а ты не мой/я");
        }
    }
}
