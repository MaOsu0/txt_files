package Lekcja1.Serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class ObjectWriter {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person p1 = new Person("Jan", "Kowalski");

        try (
                var fos = new FileOutputStream(fileName);
                var oos = new ObjectOutputStream(fos);
        ) {
            oos.writeObject(p1);
            System.out.println("Zapisan obiekt do pliku " + fileName);

        } catch (IOException e) {
            System.err.println("Błąd zapisu pliku " + fileName);
            e.printStackTrace();
        }
    }
}
