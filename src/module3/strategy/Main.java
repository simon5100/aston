package module3.strategy;

import java.util.Random;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Иван", new Random().nextInt(), "weg15weg418", UUID.randomUUID(), UUID.randomUUID());
        User user2 = new User("Сергей", new Random().nextInt(), "u6k561ti6", UUID.randomUUID(), UUID.randomUUID());
        User user3 = new User("Илья", new Random().nextInt(), "t4ukt6y54k184", UUID.randomUUID(), UUID.randomUUID());
        User user4 = new User("Олег", new Random().nextInt(), "ty8k1ty165", UUID.randomUUID(), UUID.randomUUID());

        Phone phone1 = new Phone(user1, new Face());
        Phone phone2 = new Phone(user2, new Fingerprint());
        Phone phone3 = new Phone(user3, new PinCode());
        Phone phone4 = new Phone(user4,new Password());

        user1.unlockPhone(phone1);
        user1.unlockPhone(phone4);
        System.out.println("_________________________");
        user2.unlockPhone(phone2);
        user2.unlockPhone(phone1);
        System.out.println("_________________________");
        user3.unlockPhone(phone3);
        user3.unlockPhone(phone2);
        System.out.println("_________________________");
        user4.unlockPhone(phone4);
        user4.unlockPhone(phone3);

//        ВЫВОД В КОНСОЛЬ
//        Аутентификация по лицу прошла успешно
//        Я не твой, а ты не мой/я
//        _________________________
//        Аутентификация по отпечатку прошла успешно
//        Я не твой, а ты не мой/я
//        _________________________
//        Аутентификация по пинкоду прошла успешно
//        Я не твой, а ты не мой/я
//        _________________________
//        Аутентификация по паролю прошла успешно
//        Я не твой, а ты не мой/я

    }
}
