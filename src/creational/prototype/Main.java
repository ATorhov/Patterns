package creational.prototype;

import creational.prototype.records.EmployeeRecord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Employee id: ");
        int id = Integer.parseInt(reader.readLine());
        System.lineSeparator();

        System.out.print("Enter Employee Name: ");
        String name = reader.readLine();
        System.lineSeparator();

        System.out.print("Enter Employee Designation: ");
        String designation = reader.readLine();
        System.lineSeparator();

        System.out.print("Enter Employee Address: ");
        String address = reader.readLine();
        System.lineSeparator();

        System.out.print("Enter Employee Salary: ");
        double salary = Double.parseDouble(reader.readLine());
        System.lineSeparator();

        EmployeeRecord record = new EmployeeRecord(id, name, designation, salary, address);

        record.showRecord();
        System.lineSeparator();

        EmployeeRecord clone = (EmployeeRecord) record.getClone();
        clone.showRecord();
    }
}
