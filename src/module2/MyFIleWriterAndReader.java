package module2;

import java.io.*;

public class MyFIleWriterAndReader {

    String allText = "";

    public String writeAndRead(String text) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt", true));
            BufferedReader reader = new BufferedReader(new FileReader("text.txt"))) {
            if (text.equals("")) {
                throw new MyIOException();
            }

            writer.write(text);
            writer.close();

            String line;
            while ((line = reader.readLine()) != null) {
                allText += line;
            }

            System.out.println("Вы добавили в файл текст: " + text + "\nПолное содрежание файла: " + allText);

            return allText;
        }catch (Throwable e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}