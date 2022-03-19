package Lekcja1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class FileWriterTest {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
        try (
                var fileWriter = new FileWriter(fileName, true);
                var bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            bufferedWriter.write("Bolek");
            bufferedWriter.newLine();
            bufferedWriter.write("Lolek");
            bufferedWriter.newLine();
            bufferedWriter.write("Karolek");
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
