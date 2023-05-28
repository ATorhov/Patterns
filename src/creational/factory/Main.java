package creational.factory;

import creational.factory.entities.BasePlan;
import creational.factory.factory.GetPlanFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        GetPlanFactory planFactory = new GetPlanFactory();

        System.out.println("Please, enter the name of plan for calculation.");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        System.out.println("Enter the number of units");
        int units = Integer.parseInt(reader.readLine());

        BasePlan plan = planFactory.getPlan(name);

        System.out.print("Bill amount for " +name+ " of " +units+ " units is: ");
        plan.getRate();
        plan.calculateBill(units);
    }
}
