package module3.proxy;

import module2.MyFIleWriterAndReader;

public class CallingMethodModule2Impl implements CallingMethodModule2 {

    MyFIleWriterAndReader myFIleWriterAndReader = new MyFIleWriterAndReader();

    @Override
    public String callingMethod(String text) {
        return myFIleWriterAndReader.writeAndRead(text);
    }
}
