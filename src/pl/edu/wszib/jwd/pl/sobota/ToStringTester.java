package pl.edu.wszib.jwd.pl.sobota;

import java.awt.*;

public class ToStringTester {
    public static void main(String[] args) {
        Integer i = 1;
        System.out.println(i.toString());
        System.out.println(i);

        Point point = new Point(3,4);
        System.out.println(point.toString());
        System.out.println(point);

        Employee employee = new Employee("Kowalski", 28, 3900);
        System.out.println(employee.toString());
        Employee employee2 = new Employee("Nowak", 55, 8000);
        System.out.println(employee2);
    }
}
