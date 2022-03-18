package Lekcja1;

import java.io.*;
import java.util.Scanner;

class FileCreator {
    public static void main(String[] args) {
        String fileName = "testFile.txt";

        try (
                var fileReader = new FileReader(fileName);
                var reader = new BufferedReader(fileReader);
        ) {
            String nextline = null;
            int lines = 0;
            while ((nextline = reader.readLine()) != null) {
                System.out.println(nextline);
                lines++;
            }
            System.out.println("Liczba zmiennych w pliku : " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }


//        File file = new File(fileName);
//        Scanner scan = new Scanner(file);
//
//        int lines = 0;
//        while(scan.hasNextLine()) {
//            String name = scan.nextLine();
//            System.out.println(name);
//            lines++;
//        }
//        System.out.println("liczba wierszyw w pliku " + lines);
//        scan.close();
    }
}
