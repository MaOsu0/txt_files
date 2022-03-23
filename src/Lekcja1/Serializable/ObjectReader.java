package Lekcja1.Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

class ObjectReader {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person p1 = null;

        try (
                var fis = new FileInputStream(fileName);
                var ois = new ObjectInputStream(fis);
                ){
            p1 = (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (p1 != null) {
            System.out.println("Udało się odczytać obiekt " + p1.getFirstName() + " + " + p1.getLastName() );
        }
    }
}
