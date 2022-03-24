package Zadanie1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class CompanyApp {
    public static void main(String[] args) {
        String filename = "Person.txt";
        Company companyArray = new Company();

        companyArray.addEmployee();

        try (
                var fos = new FileOutputStream(filename);
                var oos = new ObjectOutputStream(fos);
        ) {
            Employee[] employees = companyArray.employees;
            for (Employee employee : employees) {
                oos.writeObject(employee);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        Employee[] employeeTest = new Employee[3];

        try (
                var fis = new FileInputStream(filename);
                var ois = new ObjectInputStream(fis);
        ) {
            for (int i = 0; i < employeeTest.length; i++) {
                employeeTest[i] = (Employee) ois.readObject();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ignored) {

        }
        System.out.println(Arrays.toString(employeeTest));

    }
}