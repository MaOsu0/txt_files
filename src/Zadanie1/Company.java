package Zadanie1;

import java.util.Scanner;

class Company {

    final int MAX_EMPLOYEES = 3;
    Employee[] employees = new Employee[MAX_EMPLOYEES];
    int employeeIndex = 0;

    void addEmployee () {
        Scanner sc = new Scanner(System.in);
        while (employeeIndex < MAX_EMPLOYEES) {
            System.out.println("Podaj imię, nazwisko, pensję:");
            employees[employeeIndex] =
                    new Employee(sc.nextLine(), sc.nextLine(), sc.nextDouble());
            employeeIndex++;
            sc.nextLine();
        }
    }
}