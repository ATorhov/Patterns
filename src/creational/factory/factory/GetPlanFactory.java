package creational.factory.factory;

import creational.factory.entities.BasePlan;
import creational.factory.entities.CommercialPlan;
import creational.factory.entities.DomesticPlan;
import creational.factory.entities.InstitutionalPlan;

public class GetPlanFactory {

    public BasePlan getPlan(String planName) {
        BasePlan plan = null;
        if (planName.equalsIgnoreCase("DomesticPlan")){
            plan = new DomesticPlan();
        } else if (planName.equalsIgnoreCase("CommercialPlan")) {
            plan = new CommercialPlan();
        } else if (planName.equalsIgnoreCase("InstitutionalPlan")) {
            plan = new InstitutionalPlan();
        }
        return plan;
    }
}
