package module3.proxy;

public class CallingMethodModule2Proxy implements CallingMethodModule2 {

    private CallingMethodModule2 callingMethodModule2 = new CallingMethodModule2Impl();

    private String textInFile = null;

    @Override
    public String callingMethod(String text) {

        if (text.equals("") || text == null) {
            System.out.println("Вы ничего не добавили");

        } else {
            textInFile = callingMethodModule2.callingMethod(text);
        }
        return textInFile;
    }
}
