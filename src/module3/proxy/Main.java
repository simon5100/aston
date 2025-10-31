package module3.proxy;

public class Main {
    public static void main(String[] args) {

        CallingMethodModule2 callingMethodModule2 = new CallingMethodModule2Proxy();

        System.out.println(callingMethodModule2.callingMethod("Hello World"));
        System.out.println(callingMethodModule2.callingMethod(""));

//        Вы добавили в файл текст: Hello World
//        Полное содрежание файла: Hello World
//        Hello World
//        Вы ничего не добавили
//        Hello World


    }
}

